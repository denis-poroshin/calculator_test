package pro.sky.skyprocalculatortest;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class CalculatorTest {
    private double valueOne = 5;
    private double valueTwo = 3;
    private double valueOne1 = 10;
    private double valueTwo1 = -20;

    private Calculator calculator = new Calculator(valueOne, valueTwo);
    private Calculator calculator1 = new Calculator(valueOne1, valueTwo1);


    @Test
    public void divisionCheck(){
        if (calculator.getValueTwo() == 0 && calculator1.getValueTwo() == 0){
            throw new IllegalArgumentException();
        }
        calculator.divide(valueOne, valueTwo);
        calculator1.divide(valueOne1, valueTwo1);
    }

    @Test
    public void plusCheck(){
        calculator.plus(valueOne, valueTwo);
        calculator1.plus(valueOne1, valueTwo1);

    }
    @Test
    public void minusCheck(){
        calculator.minus(valueOne, valueTwo);
        calculator1.minus(valueOne1, valueTwo1);
    }
    @Test
    public void multiplyCheck(){
        calculator.multiply(valueOne, valueTwo);
        calculator1.multiply(valueOne1, valueTwo1);
    }

}
