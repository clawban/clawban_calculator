package com.example.ae.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Ae on 5/11/16 AD.
 */
@RunWith(Parameterized.class)
public class CalculatorSubTest {

    private double firstOperand;
    private double secondOperand;
    private double expectedResult;

    @Test
    public void sub(){

        Calculator calculator = new Calculator();
        assertEquals(this.expectedResult, calculator.decrease(this.firstOperand, this.secondOperand));
    }

    public CalculatorSubTest(double firstOperand, double secondOperand, double expectedResult) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {5, 9, -4.0},
            {10, 4, 6.0},
            {9, 0, 9.0},
            {8, 4, 4.0}
        });
    }


}
