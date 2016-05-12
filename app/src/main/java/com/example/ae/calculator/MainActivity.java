package com.example.ae.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorListener {

    EditText firstOperandEditText;
    EditText secondOperandEditText;
    TextView resultTextView;

    Calculator calculate = new Calculator();
    MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstOperandEditText = (EditText) findViewById(R.id.operand_one_edit_text);
        secondOperandEditText = (EditText) findViewById(R.id.operand_two_edit_text);
        resultTextView = (TextView) findViewById(R.id.operation_result_text_view);

        mainController = new MainController();
        mainController.setListener(this);
    }

    public void onAdd(View view) {

        mainController.add(Double.parseDouble(firstOperandEditText.getText().toString()), Double.parseDouble(secondOperandEditText.getText().toString()));
    }

    public void onSub(View view) {

        mainController.sub(Double.parseDouble(firstOperandEditText.getText().toString()), Double.parseDouble(secondOperandEditText.getText().toString()));
    }


    public void onMul(View view) {
        mainController.mul(Double.parseDouble(firstOperandEditText.getText().toString()), Double.parseDouble(secondOperandEditText.getText().toString()));
    }

    public void onDiv(View view) {
        mainController.divide(Double.parseDouble(firstOperandEditText.getText().toString()), Double.parseDouble(secondOperandEditText.getText().toString()));
    }

    @Override
    public void onSuccess(String result) {
        resultTextView.setText(String.valueOf(result));
    }
}
