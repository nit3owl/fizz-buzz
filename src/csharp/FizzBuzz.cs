using System;
using System.Linq;

class FizzBuzz
{
    static void Main(string[] args)
    {   
        Enumerable.Range(1, 100).Select(DetermineFizziness).ToList().ForEach(Console.WriteLine);
    }   
    static string DetermineFizziness(int n)
    {   
        string result = "";
        if(n % 3 == 0)
            result = "Fizz";
        if(n % 5 == 0)
            result += "Buzz";
        return (result.Length > 0 ? result : n.ToString());
    }   
} 