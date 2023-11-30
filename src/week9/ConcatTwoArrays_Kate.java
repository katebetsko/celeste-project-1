package week9;

import java.util.Arrays;

public class ConcatTwoArrays_Kate {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));
    }

    public static int[] concatArrays(int[] arr1, int[] arr2){
        int[] concatArrays = new int[arr1.length + arr2.length];

        int indexOfConcatArray = 0;
        for(int i = 0; i < arr1.length; i++, indexOfConcatArray++){
            concatArrays[indexOfConcatArray] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++, indexOfConcatArray++){
            concatArrays[indexOfConcatArray] = arr2[i];
        }

        return concatArrays;
    }
}
