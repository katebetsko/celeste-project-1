package week7;

public class Array_Find_Minimum_Mina {

    public static void main(String[] args) {

        int [] array = {10, 3, 2, 40, 5};

        System.out.println(mini_Num(array));


    }
    //Write a method that can find the maximum number from an int Array

    public static int mini_Num(int [] array){

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i] < min){

                min = array[i];
            }
        }

        return min ;
    }
}
