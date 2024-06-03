package pro.sky.skyprocalculatortest;

import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private double valueOne = 5;
    private double valueTwo = -20;
    private double valueOne1 = 10;
    private double valueTwo1 = -20;
    CalculatorService calculatorService = new CalculatorService();
    CalculatorService calculatorService1 = new CalculatorService();
    @Test
    public void divisionCheckValue(){
        try {
            calculatorService.divide(valueOne, valueTwo);
            calculatorService1.divide(valueOne1, valueTwo1);

        }catch ( IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }
    @Test
    public void plusCheckValue(){
        try {
            calculatorService.plus(valueOne, valueTwo);
            calculatorService1.divide(valueOne1, valueTwo1);

        }catch ( IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }
    @Test
    public void minusCheckValue(){
        try {
            calculatorService.minus(valueOne, valueTwo);
            calculatorService1.divide(valueOne1, valueTwo1);

        }catch ( IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }
    @Test
    public void multiplyCheckValue(){
        try {
            calculatorService.multiply(valueOne, valueTwo);
            calculatorService1.divide(valueOne1, valueTwo1);

        }catch ( IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }





}
