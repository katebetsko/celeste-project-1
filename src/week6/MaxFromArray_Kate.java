package week6;

public class MaxFromArray_Kate {
    /*
    Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        int[] numbers = {25,31,2,0,55,101,111};
        System.out.println("Max number is "+maxFromArray(numbers));
    }

    public static int maxFromArray(int[] numbers){
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }
}
