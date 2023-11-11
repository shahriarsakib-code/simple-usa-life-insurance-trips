package com.minetech.lifeinsurange;
// FAQAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FAQAdapter extends RecyclerView.Adapter<FAQAdapter.FAQViewHolder> {

    private List<FAQItem> faqList;

    public FAQAdapter(List<FAQItem> faqList) {
        this.faqList = faqList;
    }

    @NonNull
    @Override
    public FAQViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faq_item, parent, false);
        return new FAQViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FAQViewHolder holder, int position) {
        FAQItem faqItem = faqList.get(position);
        holder.bind(faqItem);
    }

    @Override
    public int getItemCount() {
        return faqList.size();
    }

    public class FAQViewHolder extends RecyclerView.ViewHolder {

        private TextView questionTextView;
        private TextView answerTextView;

        public FAQViewHolder(@NonNull View itemView) {
            super(itemView);
            questionTextView = itemView.findViewById(R.id.textView);
            answerTextView = itemView.findViewById(R.id.answerTextView);
        }

        public void bind(FAQItem faqItem) {
            questionTextView.setText(faqItem.getQuestion());
            answerTextView.setText(faqItem.getAnswer());

            // Set visibility of answerTextView initially to GONE
            answerTextView.setVisibility(View.GONE);

            // Set up click listener
            questionTextView.setOnClickListener(view -> toggleAnswerVisibility());
        }

        private void toggleAnswerVisibility() {
            // Toggle visibility of answerTextView
            int visibility = answerTextView.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE;
            answerTextView.setVisibility(visibility);
        }
    }
}
