package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class ButtonExercise extends AppCompatActivity {
    Activity activity;
    Button btnClose, btnToast, btnChangeBG, btnChangeBtnBG, btnDisappear;
    int[] colors = {Color.RED, Color.YELLOW, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.GREEN};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);
        activity = this;

        //===== BUTTON EXERCISE =====

        //1. change activity
        btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //2. toast button
        btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "This is a toast!", Toast.LENGTH_LONG).show();
            }
        });

        //3. change activity bg
        btnChangeBG = findViewById(R.id.btnChangeBG);
        btnChangeBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rand = new Random().nextInt(colors.length);
                activity.findViewById(android.R.id.content).setBackgroundColor(colors[rand]);
            }
        });

        //4. change button bg
        btnChangeBtnBG = findViewById(R.id.btnChangeBtnBG);
        btnChangeBtnBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rand = new Random().nextInt(colors.length);
                btnChangeBtnBG.setBackgroundColor(colors[rand]);
            }
        });

        //5. button turns invisible
        btnDisappear = findViewById(R.id.btnDisappear);
        btnDisappear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDisappear.setVisibility(View.INVISIBLE);
            }
        });
    }
}