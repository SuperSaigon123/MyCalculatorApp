package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;
import android.view.View.OnClickListener;
import com.google.android.material.snackbar.Snackbar;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Integer decPlaces = null;
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
    //Concept and basic code for onClick and onClickListener from https://www.educative.io/answers/what-is-an-onclicklistener
    private OnClickListener addOnClick = new OnClickListener(){
        public void onClick(View v) {
            EditText number1ET = findViewById(R.id.firstNumber);
            EditText number2ET = findViewById(R.id.secondNumber);
            TextView numberSumTV = findViewById(R.id.answer);
            numberSumTV.setVisibility(View.GONE);

            Button calcButton = findViewById(R.id.calculateButton);
            calcButton.setVisibility(View.GONE);

            double num1 = 0;
            double num2 = 0;

            //Information about snackbars from https://material.io/components/snackbars/android#theming-snackbars
            try {
                double newnum1 = Double.parseDouble((number1ET.getText().toString()));
                double newnum2 = Double.parseDouble((number2ET.getText().toString()));
                num1 = newnum1;
                num2 = newnum2;
            } catch (IllegalArgumentException e){
                Snackbar properNum = Snackbar.make(v, "Please enter a decimal", 5000);
                properNum.show();
            }

            double sum = num1 + num2;

            if (!(number1ET.toString().equals("")) && (!(number2ET.toString().equals("")))){
                calcButton.setVisibility(View.VISIBLE);
            }

            calcButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    numberSumTV.setText("" + sum);
                    numberSumTV.setVisibility(View.VISIBLE);
                }
            });
        }

    };

    private OnClickListener subOnClick = new OnClickListener(){
        public void onClick(View v) {
            EditText number1ET = findViewById(R.id.firstNumber);
            EditText number2ET = findViewById(R.id.secondNumber);
            TextView numberDiffTV = findViewById(R.id.answer);
            numberDiffTV.setVisibility(View.GONE);

            Button calcButton = findViewById(R.id.calculateButton);
            calcButton.setVisibility(View.GONE);

            double num1 = 0;
            double num2 = 0;

            try {
                double newnum1 = Double.parseDouble((number1ET.getText().toString()));
                double newnum2 = Double.parseDouble((number2ET.getText().toString()));
                num1 = newnum1;
                num2 = newnum2;
            } catch (IllegalArgumentException e){
                Snackbar properNum = Snackbar.make(v, "Please enter a decimal", 5000);
                properNum.show();
            }

            double diff = num1 + num2;

            if (!(number1ET.toString().equals("")) && (!(number2ET.toString().equals("")))){
                calcButton.setVisibility(View.VISIBLE);
            }

            calcButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    numberDiffTV.setText("" + diff);
                    numberDiffTV.setVisibility(View.VISIBLE);
                }
            });
        }

    };

    private OnClickListener multOnClick = new OnClickListener(){
        public void onClick(View v) {
            EditText number1ET = findViewById(R.id.firstNumber);
            EditText number2ET = findViewById(R.id.secondNumber);
            TextView numberProdTV = findViewById(R.id.answer);
            numberProdTV.setVisibility(View.GONE);

            Button calcButton = findViewById(R.id.calculateButton);
            calcButton.setVisibility(View.GONE);

            double num1 = 0;
            double num2 = 0;

            try {
                double newnum1 = Double.parseDouble((number1ET.getText().toString()));
                double newnum2 = Double.parseDouble((number2ET.getText().toString()));
                num1 = newnum1;
                num2 = newnum2;
            } catch (IllegalArgumentException e){
                Snackbar properNum = Snackbar.make(v, "Please enter a decimal", 5000);
                properNum.show();
            }

            double prod = num1 * num2;

            if (!(number1ET.toString().equals("")) && (!(number2ET.toString().equals("")))){
                calcButton.setVisibility(View.VISIBLE);
            }

            calcButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    numberProdTV.setText("" + prod);
                    numberProdTV.setVisibility(View.VISIBLE);
                }
            });
        }

    };

    private OnClickListener divOnClick = new OnClickListener(){
        public void onClick(View v) {
            EditText number1ET = findViewById(R.id.firstNumber);
            EditText number2ET = findViewById(R.id.secondNumber);
            TextView numberQuoTV = findViewById(R.id.answer);
            numberQuoTV.setVisibility(View.GONE);

            Button calcButton = findViewById(R.id.calculateButton);
            calcButton.setVisibility(View.GONE);

            double num1 = 0;
            double num2 = 0;

            try {
                double newnum1 = Double.parseDouble((number1ET.getText().toString()));
                double newnum2 = Double.parseDouble((number2ET.getText().toString()));
                num1 = newnum1;
                num2 = newnum2;
            } catch (IllegalArgumentException e){
                Snackbar properNum = Snackbar.make(v, "Please enter a decimal", 5000);
                properNum.show();
            }

            double quo = num1 / num2;

            if (!(number1ET.toString().equals("")) && (!(number2ET.toString().equals("")))){
                calcButton.setVisibility(View.VISIBLE);
            }

            calcButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    numberQuoTV.setText("" + quo);
                    numberQuoTV.setVisibility(View.VISIBLE);
                }
            });
        }
    };
}
