package pro.sky.skyprocalculatortest;

public class Calculator {
    private double valueOne;
    private double valueTwo;
    public Calculator(){

    }

    public Calculator(double valueOne, double valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }
    public String plus(double valueOne, double valueTwo){
        return valueOne + " + " + valueTwo +
                " = " + (valueOne + valueTwo);

    }
    public String minus(double valueOne, double valueTwo){
        return valueOne + " - " + valueTwo +
                " = " + (valueOne - valueTwo);

    }
    public String multiply(double valueOne, double valueTwo){
        return valueOne + " * " + valueTwo +
                " = " + (valueOne * valueTwo);

    }
    public String divide(double valueOne, double valueTwo){
        if(valueTwo == 0){
            throw new IllegalArgumentException();
        }
        return valueOne + " / " + valueTwo +
                " = " + (valueOne / valueTwo);

    }

    public double getValueOne() {
        return valueOne;
    }

    public void setValueOne(double valueOne) {
        this.valueOne = valueOne;
    }

    public double getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(double valueTwo) {
        this.valueTwo = valueTwo;
    }

}
