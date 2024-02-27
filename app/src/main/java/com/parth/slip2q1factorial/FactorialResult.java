package com.parth.slip2q1factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FactorialResult extends AppCompatActivity {

    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial_result);

        Result = findViewById(R.id.txtResult);

        int number = getIntent().getIntExtra("number",0);
        float fact = calculateFactorial(number);

        Result.setText((int) fact);
    }

    private float calculateFactorial(int number) {
        float factorial = 1;

        for(int i=1; i<= number; i++){

            factorial = factorial * i;
        }

        return factorial;
    }
}