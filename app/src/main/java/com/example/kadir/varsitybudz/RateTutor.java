package com.example.kadir.varsitybudz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

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
        rateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                payBtn.setVisibility(View.VISIBLE);
            }
        });
    }


}
