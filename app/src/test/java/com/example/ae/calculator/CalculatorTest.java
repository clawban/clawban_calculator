package com.example.ae.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void ลบ(){
        assertEquals(0.0, calculator.decrease(1, 1));
        assertEquals(2.0, calculator.decrease(3, 1));
        assertEquals(-2.0, calculator.decrease(5, 7));
    }

    @Test
    public void หนึ่งบวกหนึ่งเท่ากับสอง(){
        assertEquals(2.0, calculator.addplus(1, 1));
    }

    @Test
    public void สิบลบสามเท่ากับเจ็ด(){
        assertEquals(7.0, calculator.decrease(10, 3));
    }

    @Test
    public void ยี่สิบคูณห้าเท่ากับหนึ่งร้อย(){
        assertEquals(100.0, calculator.mul(20, 5));
    }

    @Test
    public void ยี่สิบหารห้าเท่ากับสี่(){
        assertEquals(4.0, calculator.divide(20, 5));
    }




}
