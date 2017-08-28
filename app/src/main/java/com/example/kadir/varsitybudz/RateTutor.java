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
    public TextView cvvTxt;
    public TextView expiryTxt;

    public EditText cardNo;
    public EditText cardNameEditTxt;
    public EditText cvvEdit;
    public EditText monthEditTxt;
    public EditText yearEditTxt;

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
        cardOwnerTxt = (TextView) findViewById(R.id.cardOwnerTxt);
        cvvTxt = (TextView) findViewById(R.id.cvvTxt);
        expiryTxt = (TextView) findViewById(R.id.expiryTxt);

        cardNo = (EditText) findViewById(R.id.cardNo);
        cardNameEditTxt = (EditText) findViewById(R.id.cardNameEditTxt);
        cvvEdit = (EditText) findViewById(R.id.cvvEdit);
        monthEditTxt = (EditText) findViewById(R.id.monthEditTxt);
        yearEditTxt = (EditText) findViewById(R.id.yearEditTxt);

        rateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                payBtn.setVisibility(View.VISIBLE);

                cardTxt.setVisibility(View.VISIBLE);
                cardOwnerTxt.setVisibility(View.VISIBLE);
                cvvTxt.setVisibility(View.VISIBLE);
                expiryTxt.setVisibility(View.VISIBLE);

                cardNo.setVisibility(View.VISIBLE);
                cardNameEditTxt.setVisibility(View.VISIBLE);
                cvvEdit.setVisibility(View.VISIBLE);
                monthEditTxt.setVisibility(View.VISIBLE);
                yearEditTxt.setVisibility(View.VISIBLE);



            }
        });
    }


}
