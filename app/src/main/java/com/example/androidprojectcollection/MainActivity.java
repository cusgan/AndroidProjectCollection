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
    Activity activity;

    Button btnButtonExercise, btnLayoutExercise, btnTicTacToe, btnMatch3, btnPassingIntent, btnMenu;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        //===== BUTTON EXERCISE =====
        btnButtonExercise = (Button) findViewById(R.id.btnButtonExercise);
        btnButtonExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,//this activity
                        ButtonExercise.class
                );
                startActivity(intent1);
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