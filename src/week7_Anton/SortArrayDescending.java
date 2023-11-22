package week7_Anton;

public class SortArrayDescending {

    public static void main(String[] args) {
        int[] array = new int[]{3, 12, 4, 67, 23, 14, 89, 5};

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            index = i;
            for (int j = i; j <= array.length - 1; j++) {
                // Change the condition to sort in descending order
                if (array[j] > array[index]) {
                    index = j;
                }
            }
            // Swap the found maximum element with the first element of the unsorted array
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        // Print the sorted array in descending order
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

}
