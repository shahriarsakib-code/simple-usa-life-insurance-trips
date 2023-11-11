package com.minetech.lifeinsurange;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class GetQuote extends AppCompatActivity {


    LinearLayout locationL;
    TextView locationtxt,find_text;
    TextInputLayout enterzipcode_layout;
    TextInputEditText  zipCodeEditText;
    LottieAnimationView loading;
    ImageView back_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_quote);


        locationL=findViewById(R.id.location_layout);
        locationtxt=findViewById(R.id.location_text);
        zipCodeEditText=findViewById(R.id.enter_zipcode);
        enterzipcode_layout=findViewById(R.id.filledTextField);
        find_text=findViewById(R.id.find_text);
        loading=findViewById(R.id.animationView);
        back_image=findViewById(R.id.backbutton_img);
        back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        find_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zipCode = zipCodeEditText.getText().toString().trim();

                if (zipCode.length() <= 0) {
                    zipCodeEditText.setError("Can't be empty");
                } else {
                    enterzipcode_layout.setVisibility(View.GONE);
                    loading.setVisibility(View.VISIBLE);

                    // Create a Handler with a delay of 3 seconds
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // After 3 seconds, hide loading and open the other activity
                            loading.setVisibility(View.GONE);

                            // Replace "OtherActivity.class" with the actual class you want to open
                            Intent intent = new Intent(GetQuote.this, QuoteActivity.class);
                            startActivity(intent);
                            finish(); // Optional: Close the current activity if needed
                        }
                    }, 3000);
                }
            }
        });



    }




}
