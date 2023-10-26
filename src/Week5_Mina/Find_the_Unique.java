package Week5_Mina;

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

            // it means the first appearance  and last appearance of the character and if the index numbers
            // are the same then it means it only occurred once, and this condition gives the unique ch.
            // for this condition the first and last index should be both same. and if we apply this to 'a'
            // which is first index it will give 0 and the last occurrence will be 1, therefore,
            // it can not be unique since the index are different 
        }
        return result;
    }
}
