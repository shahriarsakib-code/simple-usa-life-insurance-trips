package com.minetech.lifeinsurange;

// MainActivity.java
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WhatIs extends AppCompatActivity {

    ImageView backimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is);

        backimg=findViewById(R.id.back_img);
        backimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<FAQItem> faqList = generateFAQs();
        FAQAdapter faqAdapter = new FAQAdapter(faqList);
        recyclerView.setAdapter(faqAdapter);
    }

    private List<FAQItem> generateFAQs() {
        List<FAQItem> faqList = new ArrayList<>();
        faqList.add(new FAQItem("What Is Life Insurance?", "Life insurance is a contract between an individual and an insurance company..."));
        faqList.add(new FAQItem("Types of Life Insurance", "There are various types of life insurance, and one of them is term life insurance..."));
        faqList.add(new FAQItem("Do I really need life insurance?", "A simple way to answer this is by asking: “Do I have anyone dependent on my salary to sustain their standard of living?” In other words, if you were to pass, would those still alive have issues covering the cost of your burial? Covering rent or mortgage payments and other bills? What about any remaining medical costs? Would they have enough money to cover those and still maintain their normal life? If the answer to any of these is “No, they wouldn’t,” then you should consider what life insurance options work best for you and your needs. "));
        faqList.add(new FAQItem("How do I buy life insurance? ", "Remember, only do business with a licensed and well-reviewed insurance agent or company. Once you have an insurance agent or company who you feel confident doing business with:\n" +
                "\n" +
                "Decide how much coverage you need, for how long, and what you can afford to pay.\n" +
                "Learn what kinds of policies will provide what you need and pick the one that is best for you. Visit our Choosing Life Insurance page for more details.\n" +
                "Do not sign an application until you review it carefully to be sure the answers are complete and accurate.\n" +
                "Do not buy life insurance unless you intend to stick with your plan. It may be very costly if you quit during the early years of the policy.\n" +
                "Be sure to review your contract and understand exactly what is or isn’t covered. You can review our blog post, Understanding Your Insurance Policy for more tips on how to do this.\n" +
                "When you buy a policy, make the check payable to the company, not the agent."));
        faqList.add(new FAQItem("What is the “free to look” period?", "If you have just purchased a life insurance policy and then changed your mind about it, express this right away to your agent as you may be in your “free to look” period. During this period, you are allowed no less than 10 days from the date a life insurance policy was delivered to review and evaluate the policy. A policy sold by mail order must provide a 30-day review period. Should you elect to return the policy for any reason during the \"free to look\" period, the insurance company must refund any premium you paid. "));
        faqList.add(new FAQItem("Is it true that some companies won’t turn applicants down?", "It’s always important to make sure you understand what a company is actually offering when they make these advertisements. Such ads are for \"guaranteed issue\" policies that ask no health history questions. The company knows it is taking a risk because people with bad health could buy their policies. The company balances the risk by charging higher premiums or by limiting the amount of insurance you can buy. The premiums can be almost as much as the insurance! After a few years, you could pay more to the insurance company than it will have to pay to your beneficiary. Such policies may offer only the return of your premiums if you die within the first couple of years after you buy the policy. So once again, it is very important that you understand what is covered and what is not, and how much it will cost you before signing on to any policy. "));
        faqList.add(new FAQItem("What’s the difference between term and permanent life insurance?", "Term insurance generally has lower premiums than permanent policies. However, term life insurance does not build up cash value that you can use in the future. Term covers you – as the name suggests – for a term of one or more years. If you die within that term, death benefits are paid out. You can renew most term insurance policies for one or more terms, even if your health has changed, though premiums may be higher. So be sure to ask your insurance agent or company if you will have this option to renew after the end of the term and if there is an age cut-off for renewals. You may also combine cash value life insurance with term insurance for the period of your greatest need for life insurance to replace income. \n Permanent insurance policies remain in place as long as the premium is being paid. They also all have a cash value that increases over time and allows the policyholder to borrow against that cash value. Because of the savings element, the premiums for permanent insurance tend to be higher compared to term insurance premiums. There are four types of permanent life insurance: whole life, universal life, variable life, and variable universal life. You can learn more about these different types of permanent life insurance here, on our website.  "));
        faqList.add(new FAQItem("What does “fully paid up” mean on a permanent life insurance policy?", "“Fully paid up” means, just that. You have made enough premium payments to cover the cost of insurance for the rest of your life. "));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        faqList.add(new FAQItem("", ""));
        // Add more FAQs as needed
        return faqList;
    }
}
