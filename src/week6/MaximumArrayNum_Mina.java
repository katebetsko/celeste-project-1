package week6;

public class MaximumArrayNum_Mina {

    public static void main(String[] args) {

        int [] array = {10, 20, 30, 4000};

        System.out.println("MaxNum(array) = " + MaxNum(array));
    }


    public static int MaxNum (int [] array){

        int maxNum = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i] > maxNum){
                maxNum = array[i];
            }

        }
        return maxNum;
    }
}
