package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomethingOnClick(View view){
        Button addButton = findViewById(R.id.plusButton);
        Button subButton = findViewById(R.id.minusButton);
        Button multButton = findViewById(R.id.multiplyButton);
        Button divButton = findViewById(R.id.divideButton);

    }

    public TextView findSum(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberSumTV = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
        return numberSumTV;
    }

    public TextView findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberDiffTV = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int diff = num1 - num2;

        numberDiffTV.setText("" + diff);
        return numberDiffTV;
    }

    public TextView findProduct(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberProdTV = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int prod = num1 * num2;

        numberProdTV.setText("" + prod);
        return numberProdTV;
    }

    public TextView findQuotient(View view) {
        EditText number1ET = findViewById(R.id.firstNumber);
        EditText number2ET = findViewById(R.id.secondNumber);
        TextView numberQuoTV = findViewById(R.id.answer);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int quo = num1 / num2;

        numberQuoTV.setText("" + quo);
        return numberQuoTV;
    }


}