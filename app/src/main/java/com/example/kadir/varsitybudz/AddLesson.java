package com.example.kadir.varsitybudz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AddLesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lesson);
        createLesson();
    }

    public Button btnCreateLesson;

    public void createLesson(){
        btnCreateLesson = (Button) findViewById(R.id.createLesson);
        btnCreateLesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog();
            }
        });

    }

    private void createDialog(){
        AlertDialog.Builder alertDiag = new AlertDialog.Builder(this);
        alertDiag.setMessage("Lesson has been created");
        alertDiag.setPositiveButton("Confirm",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                Intent ceateLesson = new Intent(AddLesson.this,MainActivity.class);
                startActivity(ceateLesson);            }

        });
        alertDiag.create().show();
    }



}
