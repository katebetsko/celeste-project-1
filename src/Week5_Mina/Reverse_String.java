package Week5_Mina;

public class Reverse_String {

    public static void main(String[] args) {
        System.out.println(reverse("ABCDEF"));
    }
    public static String reverse (String str){

        String result= "";

        for (int i = str.length()-1; i>=0 ; i--) {

            result +=str.charAt(i);
        }
        return result;
    }
}
