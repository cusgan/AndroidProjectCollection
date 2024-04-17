package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class PassingIntentsExercise extends AppCompatActivity {
    Button clear;
    Button submit;
    EditText txtFname, txtLname, bdate, phone, email, address, grade, gName, gRelation, gPhone;
    RadioButton male, female, other, cs, it;
    RadioGroup rgGender, rgProgram;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        txtFname = findViewById(R.id.txtFname);
        txtLname = findViewById(R.id.txtLname);
        bdate = findViewById(R.id.editTextDate);
        phone = findViewById(R.id.editTextPhone);
        email = findViewById(R.id.txtEmail);
        address = findViewById(R.id.txtAddress);
        grade = findViewById(R.id.txtGrade);
        gName = findViewById(R.id.txtGuardianName);
        gRelation = findViewById(R.id.txtGuardianRel);
        gPhone = findViewById(R.id.editTextPhone2);
        male = findViewById(R.id.rbMale);
        female = findViewById(R.id.rbFemale);
        other = findViewById(R.id.rbOther);
        cs = findViewById(R.id.rbCS);
        it = findViewById(R.id.rbIT);
        rgGender = findViewById(R.id.rgGender);
        rgProgram = findViewById(R.id.rgProgram);

        clear = findViewById(R.id.btnClear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtFname.setText("");
                txtLname.setText("");
                bdate.setText("");
                phone.setText("");
                email.setText("");
                address.setText("");
                grade.setText("");
                gName.setText("");
                gRelation.setText("");
                gPhone.setText("");
                rgGender.clearCheck();
                rgProgram.clearCheck();
            }
        });

        submit = findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = txtFname.getText().toString();
                String lname = txtLname.getText().toString();

                String gender;
                if (male.isChecked()) gender = "Male";
                else if (female.isChecked()) gender = "Female";
                else if (other.isChecked()) gender = "Other";
                else gender = "Unknown";

                String birthdate = bdate.getText().toString();
                String phonenum = phone.getText().toString();
                String emailAdd = email.getText().toString();

                String program;
                if (cs.isChecked()) program = "BS Computer Science";
                else if (it.isChecked()) program = "BS Information Technology";
                else program = "Other";

                String homeAdd = address.getText().toString();
                String gradeAvg = grade.getText().toString();
                String guardian = gName.getText().toString();
                String guardianRel = gRelation.getText().toString();
                String guardianPhone = gPhone.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key", fname);
                intent.putExtra("lname_key", lname);
                intent.putExtra("gender_key", gender);
                intent.putExtra("birthdate_key", birthdate);
                intent.putExtra("phonenum_key", phonenum);
                intent.putExtra("emailAdd_key", emailAdd);
                intent.putExtra("program_key", program);
                intent.putExtra("homeAdd_key", homeAdd);
                intent.putExtra("gradeAvg_key", gradeAvg);
                intent.putExtra("guardian_key", guardian);
                intent.putExtra("guardianRel_key", guardianRel);
                intent.putExtra("guardianPhone_key", guardianPhone);

                startActivity(intent);
            }
        });


    }
}