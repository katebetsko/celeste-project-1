package week4.week4_Kate;

public class RemoveDuplicates {
    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCCDDD"));

    }

    public static String removeDuplicates(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(result.contains(str.charAt(i) + "")){
                continue;
            }
            result += str.charAt(i)+"";
        }
        return result;
    }
}
