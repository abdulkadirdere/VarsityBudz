package com.example.kadir.varsitybudz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class RateTutor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_tutor);
        rateBar();
        rateBtnInit();

    }

    public RatingBar ratingBar;
    public Button rateBtn;
    public Button payBtn;

    public TextView cardTxt;
    public TextView cardOwnerTxt;
    public TextView cardNameEditTxt;
    public TextView cvvTxt;
    public TextView expiryTxt;
    public EditText cardNo;

    public void rateBar(){
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void rateBtnInit(){
        rateBtn = (Button) findViewById(R.id.rate);
        payBtn = (Button) findViewById(R.id.payBtn);
        cardTxt = (TextView) findViewById(R.id.cardTxt);
        rateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                payBtn.setVisibility(View.VISIBLE);

            }
        });
    }


}
