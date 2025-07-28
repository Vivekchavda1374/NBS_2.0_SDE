import java.util.Scanner;

class Solution {
    public int catalanRecursive(int n) {
        if (n <= 1) return 1;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += catalanRecursive(i) * catalanRecursive(n - 1 - i);
        }
        return sum;
    }
    int[] dp;

    public int catalanMemo(int n) {
        dp = new int[n + 1];
        for (int i = 0; i <= n; i++) dp[i] = -1;
        return catalanDP(n);
    }

    private int catalanDP(int n) {
        if (n <= 1) return 1;

        if (dp[n] != -1) return dp[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += catalanDP(i) * catalanDP(n - 1 - i);
        }
        return dp[n] = sum;
    }
    public int catalanTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }
        return dp[n];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution sol = new Solution();

        System.out.println("Recursive Catalan: " + sol.catalanRecursive(n));
        System.out.println("Memoized Catalan: " + sol.catalanMemo(n));
        System.out.println("Tabulated Catalan: " + sol.catalanTab(n));
    }
}
