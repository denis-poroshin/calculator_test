package pro.sky.skyprocalculatortest;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CalculatorService {
    private final Calculator calculator;

    public CalculatorService() {
        this.calculator = new Calculator();
    }


    public String hello(){
        return "<h1>Добро пожаловать в калькулятор</h>" +
                "<h2>Информация:</h2>" +
                " <p>/calculator/plus?valueOne=введите свое число&valueTwo=введите свое число - должен сложить valueOne и valueTwo</p>" +
                " <p>/calculator/minus?valueOne=введите свое число&valueTwo=введите свое число - должен вычесть из valueOne valueTwo</p>" +
                " <p>/calculator/multiply?valueOne=введите свое число&valueTwo=введите свое число - должен умножить valueOne на valueTwo" +
                " <p>/calculator/divide?valueOne=введите свое число&valueTwo=введите свое число - должен разделить valueOne на valueTwo (деление на ноль запрещено)";
    }
    public String plus(double valueOne, double valueTwo){

        return calculator.plus(valueOne, valueTwo);

    }
    public String minus(double valueOne, double valueTwo){
        return calculator.minus(valueOne, valueTwo);

    }
    public String multiply(double valueOne, double valueTwo){
        return calculator.multiply(valueOne, valueTwo);

    }
    public String divide(double valueOne, double valueTwo){

        return calculator.divide(valueOne, valueTwo);

    }



}
