package week6;

public class SumOfDigitsString_Kate {
    /*
    String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */
    public static void main(String[] args) {
        String str = "abc123d4e5";
        System.out.println(sum(str));
    }

    public static int sum(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += Integer.parseInt(ch+"");
            }
        }
        return sum;
    }

}
