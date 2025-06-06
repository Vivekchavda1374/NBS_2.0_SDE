import java.util.Scanner;

public class rotateArray {
    public static void rotate(int[] arr , int k ){
        k%= arr.length;
        int[] temp = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k %=n;
    }
}
