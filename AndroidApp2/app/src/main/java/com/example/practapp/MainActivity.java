package com.example.practapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText no1, no2;
    Button AddButton;
    TextView addResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1 = findViewById(R.id.editTextNumber);
        no2 = findViewById(R.id.editTextNumber2);
        AddButton = findViewById(R.id.button);
        addResult = findViewById(R.id.textView);
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        if(no1.getText().toString().length() > 0 && no2.getText().toString().length() > 0){
            String n1 = no1.getText().toString();
            int number1 = Integer.parseInt(n1);
            String n2 = no2.getText().toString();
            int number2 = Integer.parseInt(n2);
            int sum = number1 + number2;
            addResult.setText("The sum of both the numbers is "+ sum);
        }else{
            Toast.makeText(MainActivity.this, "Enter some values to perform addition", Toast.LENGTH_SHORT).show();
        }
            }
        });
    }
}