package week6_Anton;

public class SumOfDigits {


    // Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {


        String input = "Fr1ame2wor3k4";
        int sum = calculateDigitSum(input);
        System.out.println("Sum of digits: " + sum);
    }

    public static int calculateDigitSum(String input) {
        int sum = 0;

        for (char c : input.toCharArray()) { // converts the string into an array of characters
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c); //converts the character representation of a digit to its numeric value
            }
        }

        return sum;
    }
}








