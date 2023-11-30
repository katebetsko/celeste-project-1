package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveWord_Kate {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Josh", "Emily", "Bella", "Ahmed", "Alex", "Dan", "Ahmed"));

        names.removeIf(p -> p.equalsIgnoreCase("Ahmed"));

        System.out.println(names);
    }
}
