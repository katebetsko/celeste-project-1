package testPackage.week4;

public class Frequency_Mentor {

    public static void main(String[] args) {


        int num= -95;

        reverse1(num);

    }

    public static void reverse1(int num) {

        String result = "";
        String s = String.valueOf(num);

        for (int i = s.length()-1; i >=0 ; i--) {
            result += s.charAt(i);

        }
//59-
        String s1 = "-" + result.substring(0,result.length()-1);

        System.out.println(s1);


    }
}
