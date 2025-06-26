import java.util.*;

class Pair implements Comparable<Pair> {
    double diff;
    int x, y;

    Pair(double diff, int x, int y) {
        this.diff = diff;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Pair p) {
        return Double.compare(this.diff, p.diff);
    }
}

public class MinDivPower {
    public static void main(String[] args) {
        List<Pair> list = new ArrayList<>();

        for (int x = 1; x <= 60; x++) {
            long pow2 = 1L << x;

            for (int y = 1; y <= 18; y++) {
                long pow10 = (long)Math.pow(10, y);
                double diffPercent = Math.abs((double)(pow2 - pow10) / pow10) * 100;
                list.add(new Pair(diffPercent, x, y));
            }
        }

        Collections.sort(list);

        for (int i = 0; i < 20; i++) {
            Pair p = list.get(i);
            System.out.printf("2^%d vs 10^%d → %.10f%%\n", p.x, p.y, p.diff);
        }
    }
}
