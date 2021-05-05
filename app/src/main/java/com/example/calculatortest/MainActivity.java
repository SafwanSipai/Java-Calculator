package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDecimal, btnPi;
    private Button btnAdd, btnSub, btnMul, btnDiv, btnEquals;
    private Button btnAC, btnC, btnOpenBrac, btnCloseBrac, btnMore;
    private Button btnSin, btnCos, btnTan, btnLog, btnLn;
    private Button btnFac, btnRoot, btnSquared, btnInverse;
    private TextView inputTxtView, outputTxtView;
    private int bracketsCount = 0;

    private boolean isOperator(String val) {
        if(val.isEmpty()) return true;

        switch (val.charAt(val.length()-1)) {
            case '+':
            case '-':
            case 'x':
            case '/': return true;
            default: return false;
        }
    }

    private boolean isNumber(String val) {
        if(val.isEmpty()) {
            return false;
        }
        else if(Character.isDigit(val.charAt(val.length()-1))) {
            return true;
        }
        else return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        //Initializing GUI elements

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
        btnPi = findViewById(R.id.btnPI);

        btnAdd = findViewById(R.id.btnAddition);
        btnSub = findViewById(R.id.btnSubtraction);
        btnMul = findViewById(R.id.btnMultiplication);
        btnDiv = findViewById(R.id.btnDivision);
        btnEquals = findViewById(R.id.btnEquals);
        btnDecimal = findViewById(R.id.btnDecimal);

        btnAC = findViewById(R.id.btnAC);
        btnC = findViewById(R.id.btnC);
        btnOpenBrac = findViewById(R.id.btnBracketOpen);
        btnCloseBrac = findViewById(R.id.btnBracketClosed);
        btnMore = findViewById(R.id.btnMore);

        btnSin = findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnTan = findViewById(R.id.btnTan);
        btnLog = findViewById(R.id.btnLog);
        btnLn = findViewById(R.id.btnLN);

        btnFac = findViewById(R.id.btnFactorial);
        btnRoot = findViewById(R.id.btnSquareRoot);
        btnSquared = findViewById(R.id.btnSquared);
        btnInverse = findViewById(R.id.btnInverse);

        inputTxtView.setText("");

        //On-click listeners

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

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputTxtView.getText().toString().isEmpty())
                    inputTxtView.setText(inputTxtView.getText() + "0.");
                else
                    inputTxtView.setText(inputTxtView.getText() + ".");
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
                boolean hasPassedTwo = false;
                String s = inputTxtView.getText().toString();
                if(s.contentEquals("") || s.isEmpty()) {}
                else if(isOperator(String.valueOf(s.charAt(s.length() - 1))) || isNumber(String.valueOf(s.charAt(s.length() - 1))) || s.charAt(s.length()-1) == ' ') {
                    inputTxtView.setText(s.substring(0, s.length()-1));
                }
                else if(s.substring(s.length()-2, s.length()).contentEquals("ln")) {
                    inputTxtView.setText(s.substring(0, s.length()-2));
                }
                else {
                    switch (s.substring(s.length() - 3, s.length())) {
                        case "sin":
                        case "cos":
                        case "tan":
                        case "log": inputTxtView.setText(s.substring(0, s.length() - 3));
                    }
                }
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperator(inputTxtView.getText().toString()) )
                    inputTxtView.setText(inputTxtView.getText() + "+");
                else
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperator(inputTxtView.getText().toString()))
                    inputTxtView.setText(inputTxtView.getText() + "-");
                else
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperator(inputTxtView.getText().toString()))
                    inputTxtView.setText(inputTxtView.getText() + "x");
                else
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOperator(inputTxtView.getText().toString()))
                    inputTxtView.setText(inputTxtView.getText() + "/");
                else
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
            }
        });

        btnOpenBrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + "(");
                bracketsCount++;
            }
        });

        btnCloseBrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputTxtView.setText(inputTxtView.getText() + ")");
                bracketsCount--;
            }
        });

        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MoreFeatures.class);
                startActivity(intent);
            }
        });

        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(isNumber(inputTxtView.getText().toString())))
                    inputTxtView.setText(inputTxtView.getText() + "3.14159");
                else
                    Toast.makeText(MainActivity.this, "Operator expected", Toast.LENGTH_SHORT).show();
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(isNumber(inputTxtView.getText().toString()))) {
                    inputTxtView.setText(inputTxtView.getText() + "sin ");
                }
                else
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(isNumber(inputTxtView.getText().toString()))) {
                    inputTxtView.setText(inputTxtView.getText() + "cos ");
                }
                else
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(isNumber(inputTxtView.getText().toString()))) {
                    inputTxtView.setText(inputTxtView.getText() + "tan ");
                }
                else
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(isNumber(inputTxtView.getText().toString()))) {
                    inputTxtView.setText(inputTxtView.getText() + "log ");
                }
                else
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
            }
        });

        btnLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(isNumber(inputTxtView.getText().toString()))) {
                    inputTxtView.setText(inputTxtView.getText() + "ln ");
                }
                else
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bracketsCount > 0) {
                    inputTxtView.setText((inputTxtView.getText().toString() + ")"));
                }
                else if(bracketsCount < 0) {
                    inputTxtView.setText(("(" + inputTxtView.getText().toString()));
                }
                outputTxtView.setText(String.valueOf(Evaluation.evaluate(inputTxtView.getText().toString())));
            }
        });

        btnSquared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while(bracketsCount > 0) {
                    inputTxtView.setText(inputTxtView.getText() + ")");
                    bracketsCount--;
                }
                while(bracketsCount < 0) {
                    inputTxtView.setText("(" + inputTxtView.getText());
                    bracketsCount++;
                }
                double result = Evaluation.evaluate(inputTxtView.getText().toString());
                outputTxtView.setText(String.valueOf(result*result));
            }
        });

        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while(bracketsCount > 0) {
                    inputTxtView.setText(inputTxtView.getText() + ")");
                    bracketsCount--;
                }
                while(bracketsCount < 0) {
                    inputTxtView.setText("(" + inputTxtView.getText());
                    bracketsCount++;
                }
                outputTxtView.setText(String.valueOf(Math.sqrt(Evaluation.evaluate(inputTxtView.getText().toString()))));
            }
        });

        btnFac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while(bracketsCount > 0) {
                    inputTxtView.setText(inputTxtView.getText() + ")");
                    bracketsCount--;
                }
                while(bracketsCount < 0) {
                    inputTxtView.setText("(" + inputTxtView.getText());
                    bracketsCount++;
                }
                outputTxtView.setText(String.valueOf(Evaluation.factorial(Evaluation.evaluate(inputTxtView.getText().toString()))));
            }
        });

        btnInverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputTxtView.getText().toString() == "" || isOperator(inputTxtView.getText().toString())) {
                    inputTxtView.setText(inputTxtView.getText() + "1/(");
                    bracketsCount++;
                }
                else {
                    Toast.makeText(MainActivity.this, "Illegal input", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}