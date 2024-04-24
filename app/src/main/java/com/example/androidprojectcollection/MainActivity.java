package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnClose, btnToast, btnChangeBG, btnChangeBtnBG, btnDisappear;
    Activity activity;
    int[] colors = {Color.RED, Color.YELLOW, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.GREEN};

    Button btnLayoutExercise;
    Button btnTicTacToe;
    Button btnMatch3;
    Button btnPassingIntent;
    Button btnMenu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        //===== BUTTON EXERCISE =====
        //TODO make separate activity for button exercise

        //1. change activity
        btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Return.class));
            }
        });

        //2. toast button
        btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is a toast!", Toast.LENGTH_LONG).show();
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


        //===== LAYOUT EXERCISE =====
        btnLayoutExercise = (Button) findViewById(R.id.btnLayoutExercise);
        btnLayoutExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,//this activity
                        LayoutExercise.class
                );
                startActivity(intent1);
            }
        });

        //===== CALCULATOR =====
        //TODO connect calculator and remake midterm exam


        //===== MIDTERM EXAM =====
        btnTicTacToe = (Button) findViewById(R.id.btnMatch3);
        btnTicTacToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, TicTacToe.class);
                startActivity(in);
            }
        });

        //===== MATCH 3 ===== TODO connect
        btnMatch3 = (Button) findViewById(R.id.btnMatch3);
        btnMatch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,//this activity
                        Match_3.class
                );
                startActivity(intent1);
            }
        });

        //PASSING INTENT EXERCISE
        btnPassingIntent = (Button) findViewById(R.id.btnPassingIntent);
        btnPassingIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,//this activity
                        PassingIntentsExercise.class
                );
                startActivity(intent1);
            }
        });

        //MENU EXERCISE
        btnMenu = (Button) findViewById(R.id.btnMenuExercise);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,//this activity
                        MenuExercise.class
                );
                startActivity(intent1);
            }
        });
    }
}