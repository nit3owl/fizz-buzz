import java.util.List;
import java.util.ArrayList;

public class DefaultFizzBuzzCalculator implements FizzBuzzCalculator {

    public List<String> calculate(int num) {
        if (num <= 0 || num > 100)
            throw new RuntimeException("Number must be between 1 and 100 inclusive.");
        
        List<String> results = new ArrayList<>(num);
        
        for(int i = 1; i <= num; i++) {
            results.add(calculateForNum(i));            
        }
        
        return results;
    }
    
    private String calculateForNum(int num) {
        String result = "";
        if(num % 3 == 0)
            result = "Fizz";
        if(num % 5 == 0)
            result += "Buzz";
        
        return !result.isEmpty() ? result : Integer.toString(num);
    }    
}
