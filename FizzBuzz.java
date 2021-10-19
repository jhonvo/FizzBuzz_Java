public class FizzBuzz {
    public String fizzBuzz(int number){
        //fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        // or a String cast of the number itself. 
        // Hint: You can use a String method to cast the int to a String.
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 == 0){
            return "Buzz";
        }
        return "" + number;
    }

    // NINJA BONUS 
    // Create an overloaded method for fizzBuzz
    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word){
        //fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        // or a String cast of the number itself. 
        // Hint: You can use a String method to cast the int to a String.
        if (number % 3 == 0 && number % 5 == 0){
            return multOf15Word;
        }
        if (number % 3 == 0){
            return multOf3Word;
        }
        if (number % 5 == 0){
            return multOf5Word;
        }
        return "" + number;
        // return Integer.toString(number);
    }

}
