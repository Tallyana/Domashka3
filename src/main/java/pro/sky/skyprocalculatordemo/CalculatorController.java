package pro.sky.skyprocalculatordemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        var rezult = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + rezult;
    }


    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        var rezult = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + rezult;
    }
    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        var rezult = calculatorService.divide(num1, num2);
        if (num2 == 0)
                return "Делить на ноль нельзя";
        return num1 + " / " + num2 + " = " + rezult;
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        var rezult = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + rezult;
    }
}
/* http://localhost:8080/calculator/plus?num1=5&num2=5
    http://localhost:8080/calculator/minus?num1=5&num2=5
    http://localhost:8080/calculator/divide?num1=5&num2=5
    http://localhost:8080/calculator/multiply?num1=5&num2=5
 */