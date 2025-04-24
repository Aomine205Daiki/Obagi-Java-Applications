public class CompareMethod {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int result = Integer.compare(a, b);

        if (result < 0) {
            System.out.println(a + " is less than " + b);
        } else if (result > 0) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}
