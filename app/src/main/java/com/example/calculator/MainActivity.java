package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int firstNumber;
    int secondNumber;
    int answer;
    private EditText firstTextInput;
    private EditText secondTextInput;
    private TextView textOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstTextInput = findViewById(R.id.editFirstInput);
        secondTextInput = findViewById(R.id.editSecondInput);
        textOutput = findViewById(R.id.textViewOutput);

    }


    public void addition(View view){

        firstNumber = Integer.parseInt(firstTextInput.getText().toString());
        secondNumber = Integer.parseInt(secondTextInput.getText().toString());
        answer = firstNumber + secondNumber;

        textOutput.setTextSize(30);
        textOutput.setText(Integer.toString(answer));


    }
    public void reduction(View view){

        firstNumber = Integer.parseInt(firstTextInput.getText().toString());
        secondNumber = Integer.parseInt(secondTextInput.getText().toString());
        answer = firstNumber - secondNumber;

        textOutput.setTextSize(30);
        textOutput.setText(Integer.toString(answer));


    }
    public void multiplication(View view){

        firstNumber = Integer.parseInt(firstTextInput.getText().toString());
        secondNumber = Integer.parseInt(secondTextInput.getText().toString());
        answer = firstNumber * secondNumber;

        textOutput.setTextSize(30);
        textOutput.setText(Integer.toString(answer));
    }
    public void division(View view){
        float divider;
        float divisionAnswer;

        firstNumber = Integer.parseInt(firstTextInput.getText().toString());

        divider = Float.parseFloat(secondTextInput.getText().toString());
        if (divider == 0) {
            divisionAnswer = 0;
        } else {
            divisionAnswer = firstNumber / divider;
        }
        textOutput.setTextSize(30);
        textOutput.setText(Float.toString(divisionAnswer));

    }



}