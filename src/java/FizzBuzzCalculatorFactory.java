public class FizzBuzzCalculatorFactory {
    
    public static FizzBuzzCalculator getCalculator(String type) {
        FizzBuzzCalculator fizzBuzzCalculator;
        switch(type) {
            default:
                fizzBuzzCalculator = new DefaultFizzBuzzCalculator();
        }

        return fizzBuzzCalculator;
    }
}
