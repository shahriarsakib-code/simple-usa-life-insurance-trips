package com.minetech.lifeinsurange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class QuoteActivity extends AppCompatActivity {

    RelativeLayout l1,l2,l3,l4,l5;
    TextView lT_1,lT_2,lT3,lT4;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);


        l1=findViewById(R.id.l_1);
        l2=findViewById(R.id.l_2);
        l3=findViewById(R.id.l_3);
        l4=findViewById(R.id.l_4);
        l5=findViewById(R.id.l_5);

        lT_1=findViewById(R.id.bymarket_text);
        lT_2=findViewById(R.id.healthcare_text);
        lT3=findViewById(R.id.sales_text);
        lT4=findViewById(R.id.health_insu_text);


        back=findViewById(R.id.backbutton_img);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   String text = lT_1.getText().toString();
                Intent intent = new Intent(QuoteActivity.this,QuoteDetails.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/insurance-3473c.appspot.com/o/market.png?alt=media&token=cac59667-2fef-4170-8da0-2fe4db088307");
                startActivity(intent);
            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  String text = lT_2.getText().toString();
                Intent intent = new Intent(QuoteActivity.this,QuoteDetails.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/insurance-3473c.appspot.com/o/health.png?alt=media&token=fa9d9636-5ce5-4c29-92db-be92553a8c16");
                startActivity(intent);
            }
        });

        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   String text = lT3.getText().toString();
                Intent intent = new Intent(QuoteActivity.this, QuoteDetails.class);
                intent.putExtra("url", "https://firebasestorage.googleapis.com/v0/b/insurance-3473c.appspot.com/o/health.png?alt=media&token=fa9d9636-5ce5-4c29-92db-be92553a8c16");
                startActivity(intent);
            }
        });

        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String text = lT4.getText().toString();
                Intent intent = new Intent(QuoteActivity.this,QuoteDetails.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/insurance-3473c.appspot.com/o/health_care.png?alt=media&token=7f7e25ed-4e23-4c67-a534-7006c87e755f");
                startActivity(intent);
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String text = lT4.getText().toString();
                Intent intent = new Intent(QuoteActivity.this,QuoteDetails.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/insurance-3473c.appspot.com/o/life.png?alt=media&token=3903958b-e2dc-4710-ae07-467a86b204d8");
                startActivity(intent);
            }
        });


    }
}