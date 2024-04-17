package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PassingIntentsExercise2 extends AppCompatActivity {
    TextView inFname, inLname, inGender, inBdate, inPhone, inEmail, inAddress, inGrade, inProgram, inGName, inGRel, inGPhone;
    Button returnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        inFname = findViewById(R.id.txtIntentFname);
        inLname = findViewById(R.id.txtIntentLname);
        inGender = findViewById(R.id.txtIntentGender);
        inBdate = findViewById(R.id.txtIntentBdate);
        inPhone = findViewById(R.id.txtIntentPhone);
        inEmail = findViewById(R.id.txtIntentEmail);
        inAddress = findViewById(R.id.txtIntentAddress);
        inGrade = findViewById(R.id.txtIntentGrade);
        inProgram = findViewById(R.id.txtIntentProgram);
        inGName = findViewById(R.id.txtIntentGName);
        inGRel = findViewById(R.id.txtIntentGRelation);
        inGPhone = findViewById(R.id.txtIntentGPhone);

        Intent intent = getIntent();
        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String gender = intent.getStringExtra("gender_key");
        String birthdate = intent.getStringExtra("birthdate_key");
        String phonenum = intent.getStringExtra("phonenum_key");
        String emailAdd = intent.getStringExtra("emailAdd_key");
        String program = intent.getStringExtra("program_key");
        String homeAdd = intent.getStringExtra("homeAdd_key");
        String gradeAvg = intent.getStringExtra("gradeAvg_key");
        String guardian = intent.getStringExtra("guardian_key");
        String guardianRel = intent.getStringExtra("guardianRel_key");
        String guardianPhone = intent.getStringExtra("guardianPhone_key");

        inFname.setText(fname);
        inLname.setText(lname);
        inGender.setText(gender);
        inBdate.setText(birthdate);
        inPhone.setText(phonenum);
        inEmail.setText(emailAdd);
        inAddress.setText(homeAdd);
        inGrade.setText(gradeAvg);
        inProgram.setText(program);
        inGName.setText(guardian);
        inGRel.setText(guardianRel);
        inGPhone.setText(guardianPhone);

        returnIntent = findViewById(R.id.btnReturnIntent);
        returnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}