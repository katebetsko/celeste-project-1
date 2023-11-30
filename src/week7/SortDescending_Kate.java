package week7;

import java.util.Arrays;

public class SortDescending_Kate {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortDesc(arr)));
    }

    public static int[] sortDesc(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            //System.out.println("j = " + j + ":" + Arrays.toString(arr));
            for (int i = 0; i < arr.length - 1; i++) {
                //System.out.println("i = " + i + ":" + Arrays.toString(arr));
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
