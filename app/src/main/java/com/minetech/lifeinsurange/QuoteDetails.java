package com.minetech.lifeinsurange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.concurrent.atomic.LongAdder;

public class QuoteDetails extends AppCompatActivity {

  ImageView image,back;
  LottieAnimationView loader;
  TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_details);

        image=findViewById(R.id.metrics_image);
        loader=findViewById(R.id.animationView);
        title=findViewById(R.id.title_txt);
        back=findViewById(R.id.backbutton_img);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        loader.setVisibility(View.VISIBLE);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        Picasso.get()
                .load(url)
                .into(image, new Callback(){

                    @Override
                    public void onSuccess() {
                        loader.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        title.setText("error to get data..");
                    }
                });
    }
}