package pro.sky.skyprocalculatortest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private static double valueOne = 15;
    private static double valueTwo = 1;
    private static double valueOne1 = 10;
    private static double valueTwo1 = -20;
    CalculatorService calculatorService = new CalculatorService();
    @ParameterizedTest // Почему лучше использовать assertThrows, который выкидывает ошибку если исключение небыло найдено? Приходится подставлять 0, чтобы сиключение не было выброшено исключение
    @MethodSource("provideParamsTests")
    public void pr(double argumentOne, double argumentTwo){
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(argumentOne, argumentTwo));

    }
    @ParameterizedTest // Может лучше использовать assertDoesNotThrow, который проверяет на наличие исключений?
    @MethodSource("provideParamsTests")
    public void prt(double argumentOne, double argumentTwo){
        Assertions.assertDoesNotThrow(
                () -> calculatorService.divide(argumentOne, argumentTwo));
    }


    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void divisionCheckValue(double argumentOne, double argumentTwo){
        Assertions.assertNotNull(calculatorService.divide(argumentOne, argumentTwo));

    }
    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void plusCheckValue(double argumentOne, double argumentTwo){
        Assertions.assertNotNull(calculatorService.plus(argumentOne, argumentTwo));
    }

    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void minusCheckValue(double argumentOne, double argumentTwo){
        Assertions.assertNotNull(calculatorService.minus(argumentOne, argumentTwo));
    }
    @ParameterizedTest
    @MethodSource("provideParamsTests")
    public void multiplyCheckValue(double argumentOne, double argumentTwo){
        Assertions.assertNotNull(calculatorService.multiply(argumentOne, argumentTwo));
    }

    public static Stream<Arguments> provideParamsTests(){
        return Stream.of(
                Arguments.of(valueOne, valueTwo),
                Arguments.of(valueOne1, valueTwo1)
        );
    }





}
