package com.parth.slip2q1factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputtxt = findViewById(R.id.etxtEnter);
        Button calculateBtn = findViewById(R.id.calculateBtn);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number = Integer.parseInt(inputtxt.getText().toString());

                Intent intent = new Intent(MainActivity.this,FactorialResult.class);

                intent.putExtra("number",number);
                startActivity(intent);
            }
        });
    }
}