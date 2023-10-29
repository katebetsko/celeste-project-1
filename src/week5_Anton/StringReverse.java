package week5_Anton;

public class StringReverse {

    /*
    Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String [] args) {

        String str = "ABCD";

        String reverse = "";

        for (int i= str.length()-1; i>=0; i--){
            // starting from last index

            reverse+=str.charAt(i);
            //get each character from String from last to zero indexes

        }
        System.out.println(reverse);


    }
}
