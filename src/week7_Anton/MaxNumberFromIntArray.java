package week7_Anton;

public class MaxNumberFromIntArray {

/*
Write a method that can find the maximum number from an int Array
 */

    public static void main(String[] args) {
        int [] arr = {3, 5, 1, 10, -1, 5};
        System.out.println(maxNum(arr));
    }
    public static int maxNum(int[] arr){
        int max = arr[0]; // initializes a variable max with the first element of the array (arr[0]).

        for(int each : arr){ // iterates through each element of the array
            if(each > max){
                max = each; // If the current element is greater than the current maximum, it updates the maximum to be the current element.
            }
        }
        return max;
    }

}
