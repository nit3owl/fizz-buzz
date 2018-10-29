import java.util.List;

public class FizzBuzz{
    
    public static void main(String[] args){
        FizzBuzzCalculatorFactory fizzBuzzCalculatorFactory = new FizzBuzzCalculatorFactory();
        FizzBuzzCalculator fizzBuzzCalculator = fizzBuzzCalculatorFactory.getCalculator(DefaultFizzBuzzCalculator.TYPE);

        List<String> fizzedBuzzes = fizzBuzzCalculator.calculate(100);
        fizzedBuzzes.forEach(System.out::println);
    }
}
