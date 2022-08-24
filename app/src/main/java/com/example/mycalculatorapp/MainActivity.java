package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcButton = findViewById(R.id.calculateButton);
        calcButton.setVisibility(View.GONE);

        Button addButton = findViewById(R.id.plusButton);
        Button subButton = findViewById(R.id.minusButton);
        Button multButton = findViewById(R.id.multiplyButton);
        Button divButton = findViewById(R.id.divideButton);

        addButton.setOnClickListener(addOnClick);
        subButton.setOnClickListener(subOnClick);
        multButton.setOnClickListener(multOnClick);
        divButton.setOnClickListener(divOnClick);
    }

    private OnClickListener addOnClick = new OnClickListener(){
        public void onClick(View v) {
            EditText number1ET = findViewById(R.id.firstNumber);
            EditText number2ET = findViewById(R.id.secondNumber);
            TextView numberSumTV = findViewById(R.id.answer);

            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;

            numberSumTV.setText("" + sum);
        }

    };

    private OnClickListener subOnClick = new OnClickListener(){
        public void onClick(View v) {
            EditText number1ET = findViewById(R.id.firstNumber);
            EditText number2ET = findViewById(R.id.secondNumber);
            TextView numberDiffTV = findViewById(R.id.answer);

            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int diff = num1 - num2;

            numberDiffTV.setText("" + diff);
        }

    };

    private OnClickListener multOnClick = new OnClickListener(){
        public void onClick(View v) {
            EditText number1ET = findViewById(R.id.firstNumber);
            EditText number2ET = findViewById(R.id.secondNumber);
            TextView numberProdTV = findViewById(R.id.answer);

            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int prod = num1 * num2;

            numberProdTV.setText("" + prod);
        }

    };

    private OnClickListener divOnClick = new OnClickListener(){
        public void onClick(View v) {
            EditText number1ET = findViewById(R.id.firstNumber);
            EditText number2ET = findViewById(R.id.secondNumber);
            TextView numberQuoTV = findViewById(R.id.answer);

            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int quo = num1 / num2;

            numberQuoTV.setText("" + quo);
        }
    };

    public TextView returnText(TextView t){
        return t;
    }
}