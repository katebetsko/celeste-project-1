package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValuesFromArrayList_Kate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(55,12,3,4,5,89,155,243,4,888,432,6,7));

        numbers.removeIf(p -> p < 100);
        System.out.println(numbers);

    }
}
