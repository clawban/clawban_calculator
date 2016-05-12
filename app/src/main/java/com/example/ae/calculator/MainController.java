package com.example.ae.calculator;

/**
 * Created by Ae on 5/11/16 AD.
 */
public class MainController {

    Calculator calculator = new Calculator();
    CalculatorListener listener;

    public void setListener(CalculatorListener listener){
        this.listener = listener;
    }

    public void add(double firstOperand, double secondOperand){
        listener.onSuccess(String.valueOf(calculator.addplus(firstOperand, secondOperand)));
    }

    public void sub(double firstOperand, double secondOperand){
        listener.onSuccess(String.valueOf(calculator.decrease(firstOperand, secondOperand)));
    }

    public void mul(double firstOperand, double secondOperand){
        listener.onSuccess(String.valueOf(calculator.mul(firstOperand, secondOperand)));
    }

    public void divide(double firstOperand, double secondOperand){
        listener.onSuccess(String.valueOf(calculator.divide(firstOperand, secondOperand)));
    }

}
