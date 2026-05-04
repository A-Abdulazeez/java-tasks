public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to 0");
        }

        int result = 1;
        for (int count = 2; count <= n; count++) {
            result *= count;
        }
        return result;
    }
}
