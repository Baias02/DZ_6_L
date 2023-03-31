package com.example.dz_6_l2;

import static com.example.dz_6_l2.R.id.btt_plus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private double first;
    private Integer second;
    private Double sum;
    private String operation;

    private Boolean isOperationClick;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);


    }

    public void setNumber(String number) {
        if (textView.getText().toString().equals("0") || isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
    }

    public void onNumbers(View view) {
        switch (view.getId()) {
            case R.id.btt_nol:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;
            case R.id.btt_one:
                setNumber("1");
                break;
            case R.id.btt_two:
                setNumber("2");
                break;
            case R.id.btt_three:
                setNumber("3");
                break;
            case R.id.btt_for:
                setNumber("4");
                break;
            case R.id.btt_five:
                setNumber("5");
                break;
            case R.id.btt_six:
                setNumber("6");
                break;
            case R.id.btt_seven:
                setNumber("7");
                break;
            case R.id.btt_eich:
                setNumber("8");
                break;
            case R.id.btt_nain:
                setNumber("9");
                break;
            case R.id.AC:
                textView.setText("0");
                first = 0;
                second = 0;
                sum = 0.0;
                break;

        }
        isOperationClick = false;
    }


    public void operasion(View view) {
        switch (view.getId()) {


            case btt_plus:
                isOperationClick = true;
                operation = "+";
                break;
            case R.id.btt_minus:
                isOperationClick = true;
                operation = "-";
                break;
            case R.id.btt_umnojenie:
                isOperationClick = true;
                operation = "X";
                break;
            case R.id.rozdel:
                operation = "/";
                break;
            case R.id.btt_sum:
                textView.setVisibility(View.VISIBLE);
                switch (operation) {
                    case "+":
                        sum = first + second;
                        textView.setText(sum.toString());
                        break;
                    case "-":
                        sum = first - second;
                        textView.setText(sum.toString());
                        break;
                    case "X":
                        sum = first * second;
                        textView.setText(sum.toString());
                        break;
                    case "/":
                        sum = first / second;
                        textView.setText(sum.toString());
                        break;
                }
        }
        isOperationClick = true;

    }
}

