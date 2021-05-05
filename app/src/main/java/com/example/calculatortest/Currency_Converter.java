package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Currency_Converter extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAC, btnC, btnDecimal, btnConvert;
    private TextView inputTxtView, outputTxtView;
    private Spinner spinnerTo, spinnerFrom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency__converter);

        inputTxtView = findViewById(R.id.inputTxtView);
        outputTxtView = findViewById(R.id.outputTxtView);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAC = findViewById(R.id.btnAC);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnConvert = findViewById(R.id.btnConvert);
        spinnerFrom = findViewById(R.id.spinnerInput);
        spinnerTo = findViewById(R.id.spinnerOutput);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputTxtView.getText() != "0")
                    inputTxtView.setText(inputTxtView.getText() + "0");
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText("");
                outputTxtView.setText("");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputTxtView.getText().toString().contentEquals("") || inputTxtView.getText().toString().isEmpty()) {}
                else {
                    String s = inputTxtView.getText().toString();
                    s = s.substring(0, s.length() - 1);
                    inputTxtView.setText(s);
                }
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputTxtView.getText().toString().isEmpty())
                    inputTxtView.setText(inputTxtView.getText() + "0.");
                else
                    inputTxtView.setText(inputTxtView.getText() + ".");
            }
        });

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}