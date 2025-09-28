package com.example.hw01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;
    double resulte;
    String error;
    String delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv = findViewById(R.id.tv01);

        Intent gi = getIntent();
        resulte = gi.getDoubleExtra("n",0.0);
        error = gi.getStringExtra("nn");
        delete = gi.getStringExtra("nnn");

        if (delete.equals("clicked")){
            tv.setText("  ");
        }else if (error.equals("error")) {
            tv.setText(String.valueOf(error));
        } else {
            tv.setText(String.valueOf(resulte));
        }

    }

}