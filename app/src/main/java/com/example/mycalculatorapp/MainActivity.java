package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void findSum(View v) {
            EditText number1ET = findViewById(R.id.firstNumber);
            EditText number2ET = findViewById(R.id.secondNumber);
            //TextView numberSumTV = findViewById(R.id.cal);

            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;

            //numberSumTV.setText("" + sum);
        }

    }
}