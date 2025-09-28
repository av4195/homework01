package com.example.hw01;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText et1;

    Button plus;
    Button minus;
    Button multiplication;
    Button division;

    Button btnAC;
    Button btne;
    Button btnCredits;

    double num1;
    double num2;
    double result;
    String operator;
    String noAnswer;
    String Click;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);

        btnAC = findViewById(R.id.btnAC);
        btne = findViewById(R.id.btne);
        btnCredits = findViewById(R.id.btnCredits);


    }


    public void plus(View view) {
        num1 = Double.parseDouble(et1.getText().toString());
        operator = "+";
        et1.setText("");
    }


    public void minus(View view) {
        num1 = Double.parseDouble(et1.getText().toString());
        operator = "-";
        et1.setText("");
    }

    public void multiplication(View view) {
        num1 = Double.parseDouble(et1.getText().toString());
        operator = "*";
        et1.setText("");
    }

    public void division(View view) {
        num1 = Double.parseDouble(et1.getText().toString());
        operator = "/";
        et1.setText("");
    }


    public void AC(View view) {
        num1=0;
        num2=0;
        result=0;
        noAnswer="0";
        Click = "clicked";

    }


    public void equals(View view) {
        num2 = Double.parseDouble(et1.getText().toString());

        if (operator.equals("+")) {
            result = num1+num2 ;
        } else if (operator.equals("-")) {
            result = num1-num2 ;
        } else if (operator.equals("*")) {
            result = num1*num2 ;
        } else {
            if (num2 != 0) {
                result = num1 / num2;
            }else{
                noAnswer = "Error";
            }
        }


    }

    public void credits(View view) {
     Intent si = new Intent(this, MainActivity2.class);
     si.putExtra("n",result);
     si.putExtra("nn",noAnswer);
     si.putExtra("nnn", Click);
     startActivity(si);
    }
}