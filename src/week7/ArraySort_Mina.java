package week7;

import java.util.Arrays;

public class ArraySort_Mina {

    public static void main(String[] args) {

        int [] array = {1, 4, 5, 76, 23, 44, 5, 8, 100};

        System.out.println(Arrays.toString(sortArrayAscending(array)));

        System.out.println(Arrays.toString(sortArrayDescending(array)));

    }
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    // arr = Sort(arr); ==>{ 7, 8, 9, 10};
    public static int [] sortArrayAscending(int [] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length-1; j++) {

                if(array[j] > array[j+1]){

                    int tempo = array[j];

                    array[j] = array[j+1];

                   array[j+1] = tempo;
                }
            }
        }
        return array;
    }

    public static int [] sortArrayDescending (int [] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length-1; j++) {

                if(array[j +1] > array[j] ){

                    int tempoNum= array[j];

                    array [j] = array[j +1];

                    array[j+1] = tempoNum;

                }

            }

        }
        return array;
    }
}
