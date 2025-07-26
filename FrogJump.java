import java.util.Arrays;

class FrogJump {
    static int minCostRec(int n, int[] height, int[] memo) {
        if (n == 1)
            return 0;
        if (n == 2)
            return Math.abs(height[n - 1] - height[n - 2]);
        if (memo[n] != -1)
            return memo[n];

        memo[n] = Math.min(minCostRec(n - 1, height, memo)
                        + Math.abs(height[n - 1] - height[n - 2]),
                minCostRec(n - 2, height, memo)
                        + Math.abs(height[n - 1] - height[n - 3]));

        return memo[n];
    }

    static int minCost(int[] height) {
        int n = height.length;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return minCostRec(n, height, memo);
    }

    public static void main(String[] args) {
        int[] height = {20, 30, 40, 20};
        System.out.println(minCost(height));
    }
}