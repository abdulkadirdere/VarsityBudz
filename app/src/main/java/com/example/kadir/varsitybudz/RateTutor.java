package com.example.kadir.varsitybudz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
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
        payBtn();
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
                ratingBar.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View v, MotionEvent event) {
                        return true;
                    }
                });
                ratingBar.setFocusable(false);

            }
        });
    }

    //completion message
    private void createDialog() {
        AlertDialog.Builder alertDiag = new AlertDialog.Builder(this);
        alertDiag.setMessage("Lesson has been booked");
        alertDiag.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent main = new Intent(RateTutor.this,MainActivity.class);
                startActivity(main);
            }

        });
        alertDiag.create().show();
    }
    public void payBtn(){
        Button submit = (Button) findViewById(R.id.payBtn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog();

            }
        });
    }

}
