import java.util.Arrays;

public class CopyOfMethod{
    public static void main(String[] args) {
        // Original array
        int[] original = {1, 2, 3, 4, 5};

        int[] copy = Arrays.copyOf(original, 7); 

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}
