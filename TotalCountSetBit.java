public class TotalCountSetBit {
    public static int countTotalSetBits(int n) {
        if (n == 0) return 0;
        int x = highestPowerOf2(n);
        int bitsUpTo2PowX = x * (1 << (x - 1));
        int msbSetBits = n - (1 << x) + 1;
        int rest = countTotalSetBits(n - (1 << x));

        return bitsUpTo2PowX + msbSetBits + rest;
    }
    public static int highestPowerOf2(int n) {
        int x = 0;
        while ((1 << (x + 1)) <= n) {
            x++;
        }
        return x;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total set bits from 1 to " + n + " = " + countTotalSetBits(n));
    }
}
