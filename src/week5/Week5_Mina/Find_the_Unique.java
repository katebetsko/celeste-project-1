package week5.Week5_Mina;

public class Find_the_Unique {

    public static void main(String[] args) {
        System.out.println(Unique("AFFBSSSDSKSF")); //ABDK
    }

    public static String Unique (String str){

        String result = "";
        for (int i = 0; i < str.length(); i++){

        char eachChar = str.charAt(i);

        if(str.indexOf(eachChar) == str.lastIndexOf(eachChar)){
            result+= eachChar;
        }
        }
        return result;
    }
}
