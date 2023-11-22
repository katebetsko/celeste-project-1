package week7_Anton;

import java.util.Arrays;

public class SortArrayAscending {


/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */

    public static void main(String[] args) {

        int[] array = new int[]{3, 12, 4, 67, 23, 14, 89, 5}; // Bubble sort

        int index = -1; // create an integer type variable “index” that will store the indexes of the array, initialized with “-1” because the index of array starts from 0

        for (int i = 0; i <array.length; i++){  //first loop will iterate until the length of the array and the second one will be used to check the condition and swap the elements if the 1st element is less than the 2nd
            index = i;
            for (int j = i ; j <= array.length-1; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ","); // print sorted array
        }




    }}
