package com.example.kadir.varsitybudz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectLesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lesson);
        btnSelectMath();
    }

    public Button btnSelectMath;

    public void btnSelectMath(){
        btnSelectMath = (Button) findViewById(R.id.selectMathBtn);
        btnSelectMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rateTutor = new Intent(SelectLesson.this,RateTutor.class);
                startActivity(rateTutor);
            }
        });
    }
}
