package com.example.findme_technovation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button music;
    Button exercise;
    Button game;

    public MainActivity() {
        music = (Button) findViewById(R.id.musicButton);
        exercise = (Button) findViewById(R.id.exerciseButton);
        game = (Button) findViewById(R.id.gameButton);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, MusicActivity.class));
            }

        });
        exercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
            }

        });

        game.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, GameActivity.class));
            }

        });

    }
}