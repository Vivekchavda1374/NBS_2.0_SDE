import java.util.Scanner;

public class TowerOfHonai {
    public static int towerOfHonai(int n) {
        if (n == 1) {
            return 1;
        }
        if( n <= 0) {
            return 0;
        }
        return 2 * towerOfHonai(n - 1) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("cannot be negative.");
        } else {
            int moves = towerOfHonai(n);
            System.out.println("moves required: " + moves);
        }
        sc.close();

    }
}
