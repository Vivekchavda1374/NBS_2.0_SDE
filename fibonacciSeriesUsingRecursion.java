public class fibonacciSeriesUsingRecursion {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series: ");
        printFib(n - 1);
    }

    public static int printFib(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = printFib(n - 1) + printFib(n - 2);
        System.out.print(fib + " ");
        return fib;
    }
}