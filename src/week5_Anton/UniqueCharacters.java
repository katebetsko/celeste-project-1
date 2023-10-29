package week5_Anton;

public class UniqueCharacters {

    /*
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */
    public static void main(String[] args) {


        String str = "AAABBBCCCDEF";

        String uniqueChar = "";

        for (int j = 0; j <str.length(); j++){ //iterates through each character of String str

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i =0; i<str.length(); i++){
                // checks how many times the ch has appeared in str
                if (str.charAt(i)==ch){
                    frequency++;

                }
            }
            if (frequency ==1){
                uniqueChar+=ch;
            }
        }

        System.out.println(uniqueChar);
    }


}
