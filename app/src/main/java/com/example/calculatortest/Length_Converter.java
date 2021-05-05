package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class Length_Converter extends AppCompatActivity{

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnAC, btnC;
    private Button btndot;
    private Button btnConvert, btnClear;
    private Spinner spinnerInput, spinnerOutput;
    TextView inputTxtView, outputTxtView;

    private String strInput = "";
    private String strOutput = "";


    private double meterToCentimeter = 100.00;
    private double meterToMillimeter = 1000.00;
    private double meterToKilometer = 0.001;
    private double meterToFoot = 3.28084;
    private double meterToInches = 39.37008;
    private double meterToYard = 1.093613;
    private double meterToMile = 0.0006213712;
    private double meterToMeter = 1.00;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length__converter);

        getSupportActionBar().hide();

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

        btnC = findViewById(R.id.btnC);

        btndot = findViewById(R.id.btndot);

        inputTxtView = findViewById(R.id.inputTxtView);
        outputTxtView = findViewById(R.id.outputTxtView);

        btnConvert = findViewById(R.id.btnConvert);
        btnClear = findViewById(R.id.btnClear);

        spinnerInput = findViewById(R.id.spinnerInput);
        spinnerOutput = findViewById(R.id.spinnerOutput);

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

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputTxtView.getText().toString().isEmpty())
                    inputTxtView.setText(inputTxtView.getText() + "0.");
                else
                    inputTxtView.setText(inputTxtView.getText() + ".");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = inputTxtView.getText().toString();
                s = s.substring(0, s.length() - 1);
                inputTxtView.setText(s);
            }
        });


        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inputTxtView.getText().toString().equals("")){

                    strInput = spinnerInput.getSelectedItem().toString();
                    strOutput = spinnerOutput.getSelectedItem().toString();

                    Double toPrint = 0.0;

                    Double d1 = Double.parseDouble(inputTxtView.getText().toString());

                    switch (strInput) {
                        case "Millimeter":
                            toPrint = d1 / meterToMillimeter;
                            break;
                        case "Centimeter":
                            toPrint = d1 / meterToCentimeter;
                            break;
                        case "Meter":
                            toPrint = d1 / meterToMeter;
                            break;
                        case "Kilometer":
                            toPrint = d1 / meterToKilometer;
                            break;
                        case "Foot":
                            toPrint = d1 / meterToFoot;
                            break;
                        case "Inches":
                            toPrint = d1 / meterToInches;
                            break;
                        case "Yard":
                            toPrint = d1 / meterToYard;
                            break;
                        case "Mile":
                            toPrint = d1 / meterToMile;
                            break;
                    }

                    switch (strOutput) {
                        case "Millimeter":
                            toPrint *= meterToMillimeter;
                            break;
                        case "Centimeter":
                            toPrint *= meterToCentimeter;
                            break;
                        case "Meter":
                            toPrint *= meterToMeter;
                            break;
                        case "Kilometer":
                            toPrint *= meterToKilometer;
                            break;
                        case "Foot":
                            toPrint *= meterToFoot;
                            break;
                        case "Inches":
                            toPrint *= meterToInches;
                            break;
                        case "Yard":
                            toPrint *= meterToYard;
                            break;
                        case "Mile":
                            toPrint *= meterToMile;
                            break;
                    }

                    outputTxtView.setText(toPrint.toString());
                }

            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText("");
                outputTxtView.setText("");
            }
        });

    }
}