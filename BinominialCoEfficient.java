import java.util.Arrays;

public class BinominialCoEfficient {
    public static int binomialCoefficient(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static int binomialCoefficientMemo(int n, int k) {
        int[][] memo = new int[n + 1][k + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return binomialCoefficientMemoHelper(n, k, memo);
    }

    private static int binomialCoefficientMemoHelper(int n, int k, int[][] memo) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        if (memo[n][k] != -1) return memo[n][k];

        memo[n][k] = binomialCoefficientMemoHelper(n - 1, k - 1, memo) + binomialCoefficientMemoHelper(n - 1, k, memo);
        return memo[n][k];
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(binomialCoefficient(n, k));
        System.out.println(binomialCoefficientMemo(n, k));
    }
}