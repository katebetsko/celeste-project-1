package week6;

public class FindSum_InString_Mina {
    public static void main(String[] args) {


        System.out.println(sum("abc456"));
    }

    //find the sum of digits in a string


    public static int sum( String str) {

        int total = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c >= 48 && c <= 57) {

                total += Character.getNumericValue(c);
            }
        }
        return total;
    }
}
