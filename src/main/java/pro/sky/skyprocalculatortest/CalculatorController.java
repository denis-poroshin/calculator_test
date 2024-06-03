package pro.sky.skyprocalculatortest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping()
    public String hello(){
        return calculatorService.hello();
    }
    @GetMapping("/plus")

    public String plus(@RequestParam("valueOne") double valueOne, @RequestParam("valueTwo") double valueTwo){

      return calculatorService.plus(valueOne, valueTwo);

    }
    @GetMapping("/minus")
    public String minus(@RequestParam("valueOne") double valueOne, @RequestParam("valueTwo") double valueTwo){
        return calculatorService.minus(valueOne, valueTwo);

    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("valueOne") double valueOne, @RequestParam("valueTwo") double valueTwo){
        return calculatorService.multiply(valueOne, valueTwo);

    }
    @GetMapping("/divide")
    public String divide(@RequestParam("valueOne") double valueOne, @RequestParam("valueTwo") double valueTwo){
        return calculatorService.divide(valueOne, valueTwo);

    }
}
