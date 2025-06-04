import java.util.*;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxArr = a[0];
        for (int i = 0; i < n; i++) {
            maxArr = Math.max(a[i], maxArr);
        }
        System.out.println(maxArr);
    }
}
