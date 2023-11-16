package week6_Anton;

public class MaximumNumFromArray {


        public static void main(String args[])
        {
            int arr[] = {11, 22, 1, 10, 99,88};
            int max = arr[0];
            for(int i=0; i<arr.length; i++) //iterate through the array to find the maximum value
            {
                if(max < arr[i]) // check if the current element is greater than the current maximum
                {
                    max = arr[i];
                }
            }
            System.out.print(max);
        }
    }

