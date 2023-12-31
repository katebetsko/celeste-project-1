package week4.week4_Kate;

public class FrequencyOfChars {
    /*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDDF"));

    }

    public static String frequencyOfChars(String str) {
        String result = "";
        for (int j = 1; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (result.contains(str.charAt(j) + "")) {
                continue;
            }
            result += str.charAt(j) + "" + count;
        }
        return result;
    }
}
