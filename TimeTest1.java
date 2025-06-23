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

    public static int[] myCall(int n) {
        int[] out = new int[n+1];
        for(int i = 1 ; i<out.length;i++){
            out[i]=out[i>>1]+i%2;
        }
        return out;
    }
}
