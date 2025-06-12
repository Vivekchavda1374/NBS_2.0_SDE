import java.text.DecimalFormat;

public class VedicSqrtDeviation {
    public static double vedicSqrtApprox(int n) {
        int A = (int) Math.floor(Math.sqrt(n));
        int B = n - (A * A);
        if (A == 0)
            return 0.0;
        return A + ((double) B) / (2 * A);
    }
    public static double deviationPercent(double approx, double actual) {
        return Math.abs(approx - actual) / actual * 100.0;
    }

    public static void main(String[] args) {
        final int LIMIT = 100_000_000;
        int count = 0;
        DecimalFormat df = new DecimalFormat("#.######");

        for (int n = 2; n < LIMIT; ++n) {
            double actualSqrt = Math.sqrt(n);
            double approxSqrt = vedicSqrtApprox(n);
            double deviation = deviationPercent(approxSqrt, actualSqrt);


            if (deviation > 5.0) {
                System.out.println(n + " " + df.format(actualSqrt) + " " + df.format(approxSqrt) + " " + df.format(deviation));
                ++count;
            }
            if (n % 10_000_000 == 0) {
                System.err.println("Checked up to: " + n);
            }
        }

        System.out.println("\nTotal numbers with >2% deviation: " + count);
    }
}