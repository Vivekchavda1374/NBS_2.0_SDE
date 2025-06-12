
class PowerFunction {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (n < 0) {
            x = 1 / x;
            if (n == Integer.MIN_VALUE) {
                return x * myPow(x, Integer.MAX_VALUE);
            }
            n = -n;
        }
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        PowerFunction powerFunction = new PowerFunction();
        double x = 2.0;
        int n = 10;
        double result = powerFunction.myPow(x, n);
        System.out.println("Result of " + x + " raised to the power of " + n + " is: " + result);
    }
}