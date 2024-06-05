package pro.sky.skyprocalculatortest;


import net.bytebuddy.asm.MemberSubstitution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private static double valueOne = 5;
    private static double valueTwo = 3;
    private static double valueOne1 = 10;
    private static double valueTwo1 = 17;

    private final Calculator calculator = new Calculator(valueOne, valueTwo);
    private final Calculator calculator1 = new Calculator(valueOne1, valueTwo1);
    @ParameterizedTest // Почему лучше использовать assertThrows, который выкидывает ошибку если исключение небыло найдено? Приходится подставлять 0, чтобы сиключение не было выброшено исключение
    @MethodSource("provideParamsTests")
    public void pr(double argumentOne, double argumentTwo){
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(argumentOne, argumentTwo)); // если подставить ноль в argumentTwo ошибки не будет
        assertThrows(IllegalArgumentException.class,
                () -> calculator1.divide(argumentOne, argumentTwo)); // если подставить ноль в argumentTwo ошибки не будет

    }
    @ParameterizedTest // Может лучше использовать assertDoesNotThrow, который проверяет на наличие исключений?
    @MethodSource("provideParamsTests")
    public void prt(double argumentOne, double argumentTwo){
        Assertions.assertDoesNotThrow(
                () -> calculator.divide(argumentOne, argumentTwo));
        Assertions.assertDoesNotThrow(
                () -> calculator1.divide(argumentOne, argumentTwo));
    }

    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void divisionCheck(double argumentOne, double argumentTwo){
        calculator.divide(argumentOne, argumentTwo);

    }

    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void plusCheck(double argumentOne, double argumentTwo){
        calculator.plus(argumentOne, argumentTwo);


    }
    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void minusCheck(double argumentOne, double argumentTwo){
        calculator.minus(argumentOne, argumentTwo);

    }
    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void multiplyCheck(double argumentOne, double argumentTwo){
        calculator.multiply(argumentOne, argumentTwo);
    }
    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void equalityCheckDivide(double argumentOne, double argumentTwo){
        Assertions.assertEquals(argumentOne + " / " + argumentTwo +
                " = " + (argumentOne / argumentTwo), calculator.divide(argumentOne, argumentTwo));


    }
    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void equalityCheckPlus(double argumentOne, double argumentTwo){
        Assertions.assertEquals(argumentOne + " + " + argumentTwo +
                " = " + (argumentOne + argumentTwo), calculator.plus(argumentOne, argumentTwo));


    }
    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void equalityCheckMinus(double argumentOne, double argumentTwo){
        Assertions.assertEquals(argumentOne + " - " + argumentTwo +
                " = " + (argumentOne - argumentTwo), calculator.minus(argumentOne, argumentTwo));


    }
    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void equalityCheckMultiply(double argumentOne, double argumentTwo){
        Assertions.assertEquals(argumentOne + " * " + argumentTwo +
                " = " + (argumentOne * argumentTwo), calculator.multiply(argumentOne, argumentTwo));


    }
    public static Stream<Arguments> provideParamsTests(){
        return Stream.of(
                Arguments.of(valueOne, valueTwo),
                Arguments.of(valueOne1, valueTwo1)
        );
    }



}
