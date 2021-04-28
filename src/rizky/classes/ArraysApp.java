package rizky.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,2,3,5,3,2,103,3837,9
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 9));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 100));

        int[] result = Arrays.copyOf(numbers,4);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers,4, 9);
        System.out.println(Arrays.toString(result2));
    }
}
