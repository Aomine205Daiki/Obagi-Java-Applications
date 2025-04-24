import java.util.Arrays;

public class BinarySearchMethod {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 1, 9, 4, 2};

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int target = 4;
        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
