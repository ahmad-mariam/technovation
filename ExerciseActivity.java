package com.example.findme_technovation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExerciseActivity extends MainActivity {
    Button home;


    public ExerciseActivity() {
        home = (Button) findViewById(R.id.homeButtonE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExerciseActivity.this, MainActivity.class));
            }
        });
    }
}
