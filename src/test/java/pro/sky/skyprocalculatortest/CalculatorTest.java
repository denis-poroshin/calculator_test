package pro.sky.skyprocalculatortest;


import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator(5, 3);
    private Calculator calculator1 = new Calculator(0, 3);



    @Test
    public void divisionCheck(){
        if (calculator.getValueTwo() == 0 || calculator1.getValueTwo() == 0){
            throw new IllegalArgumentException();
        }

    }
    @Test
    public void plusCheck(){
        //Честно говоря я не совсем понял, что сдесь написать, т.к. я не могу подать null или "" в конструктор
        // поэтому заведомо требуется подать какое-то значение, а ошибку 404 Спринг выбрасывает и без моей помощи

    }
    @Test
    public void minusCheck(){
        //Честно говоря я не совсем понял, что сдесь написать, т.к. я не могу подать null или "" в конструктор
        // поэтому заведомо требуется подать какое-то значение, а ошибку 404 Спринг выбрасывает и без моей помощи
    }
    @Test
    public void multiplyCheck(){
        //Честно говоря я не совсем понял, что сдесь написать, т.к. я не могу подать null или "" в конструктор
        // поэтому заведомо требуется подать какое-то значение, а ошибку 404 Спринг выбрасывает и без моей помощи
    }

}
