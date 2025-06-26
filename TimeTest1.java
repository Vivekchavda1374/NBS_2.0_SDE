public class TimeTest1 {
    public static void main(String[] args) {
        int n = 1;
        int iterations = 1000000;
        long totalTime = 0;

        for (int i = 0; i < iterations; i++) {
            long nanoStart = System.nanoTime();
            myCall(n);
            long nanoEnd = System.nanoTime();
            totalTime += (nanoEnd - nanoStart);
        }

        double averageTime = (double) totalTime / iterations;
        System.out.println("Average Elapsed Time (nanoseconds): " + averageTime);
    }

    public static int myCall(int n) {
        int minDev = Integer.MAX_VALUE;
        int bestX = 0, bestY = 0;
        for (int x = 1; x <= 100; x++) {
            long pow2 = 1L << x;
            for (int y = 1; y <= 38; y++) {
                long pow10 = (long) Math.pow(10, y);
                long dev = Math.abs(pow2 - pow10);
                if (dev < minDev) {
                    minDev = (int) dev;
                    bestX = x;
                    bestY = y;
                }
            }
        }
        System.out.println("Minimum dev at x = " + bestX + ", y = " + bestY);
        return bestX;
    }
}
