package com.example.kadir.varsitybudz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profBtnInit();
        studentBtnInit();
    }

    //prof button
    public Button btnStudent;
    public Button btnProf;

    public void profBtnInit() {
        btnProf = (Button) findViewById(R.id.prof);
        btnProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addLesson = new Intent(MainActivity.this,AddLesson.class);
                startActivity(addLesson);
            }
        });
    }
    public void studentBtnInit(){
        btnStudent = (Button) findViewById(R.id.student);
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selectLesson = new Intent(MainActivity.this, SelectLesson.class);
                startActivity(selectLesson);
            }
        });
    }
}