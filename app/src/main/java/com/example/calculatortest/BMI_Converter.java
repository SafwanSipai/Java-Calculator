package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BMI_Converter extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnAC, btnC;
    private Button btndot;
    private Button btnConvert, btnClear;
    TextView heightTxtView, weightTxtView, outputTxtView;

    private String strHeightInput = "";
    private String strWeightInput = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i__converter);

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

        heightTxtView = findViewById(R.id.enterHeight);
        weightTxtView = findViewById(R.id.enterWeight);
        outputTxtView = findViewById(R.id.outputTxtView);

        btnConvert = findViewById(R.id.btnConvert);
        btnClear = findViewById(R.id.btnClear);

        heightTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heightTxtView.setText(heightTxtView.getText() + "1");
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heightTxtView.setText(heightTxtView.getText() + "2");
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heightTxtView.setText(heightTxtView.getText() + "3");
                    }
                });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heightTxtView.setText(heightTxtView.getText() + "4");
                    }
                });

                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heightTxtView.setText(heightTxtView.getText() + "5");
                    }
                });

                btn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heightTxtView.setText(heightTxtView.getText() + "6");
                    }
                });

                btn7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heightTxtView.setText(heightTxtView.getText() + "7");
                    }
                });

                btn8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heightTxtView.setText(heightTxtView.getText() + "8");
                    }
                });

                btn9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heightTxtView.setText(heightTxtView.getText() + "9");
                    }
                });

                btn0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (heightTxtView.getText() != "0")
                            heightTxtView.setText(heightTxtView.getText() + "0");
                    }
                });

                btndot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (heightTxtView.getText().toString().isEmpty())
                            heightTxtView.setText(heightTxtView.getText() + "0.");
                        else
                            heightTxtView.setText(heightTxtView.getText() + ".");
                    }
                });

                btnC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s = heightTxtView.getText().toString();
                        s = s.substring(0, s.length() - 1);
                        heightTxtView.setText(s);
                    }
                });                
            }
        });
        
        weightTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        weightTxtView.setText(weightTxtView.getText() + "1");
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        weightTxtView.setText(weightTxtView.getText() + "2");
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        weightTxtView.setText(weightTxtView.getText() + "3");
                    }
                });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        weightTxtView.setText(weightTxtView.getText() + "4");
                    }
                });

                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        weightTxtView.setText(weightTxtView.getText() + "5");
                    }
                });

                btn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        weightTxtView.setText(weightTxtView.getText() + "6");
                    }
                });

                btn7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        weightTxtView.setText(weightTxtView.getText() + "7");
                    }
                });

                btn8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        weightTxtView.setText(weightTxtView.getText() + "8");
                    }
                });

                btn9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        weightTxtView.setText(weightTxtView.getText() + "9");
                    }
                });

                btn0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (weightTxtView.getText() != "0")
                            weightTxtView.setText(weightTxtView.getText() + "0");
                    }
                });

                btndot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (weightTxtView.getText().toString().isEmpty())
                            weightTxtView.setText(weightTxtView.getText() + "0.");
                        else
                            weightTxtView.setText(weightTxtView.getText() + ".");
                    }
                });

                btnC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(weightTxtView.getText().toString().contentEquals("") || weightTxtView.getText().toString().isEmpty()) {}
                        else {
                            String s = weightTxtView.getText().toString();
                            s = s.substring(0, s.length() - 1);
                            weightTxtView.setText(s);
                        }
                    }
                });
                
            }
        });



        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                strHeightInput = heightTxtView.toString();

                Double heightOutput = Double.parseDouble(heightTxtView.getText().toString());
                Double weightOutput = Double.parseDouble(weightTxtView.getText().toString());

                Double mainOutput = weightOutput / (heightOutput*heightOutput);

                DecimalFormat df = new DecimalFormat("#.###");

                outputTxtView.setText(df.format(mainOutput));

            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heightTxtView.setText("");
                weightTxtView.setText("");
                outputTxtView.setText("");
            }
        });
    }
}