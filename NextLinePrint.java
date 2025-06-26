import java.util.Scanner;

public class NextLinePrint {

    static void print(int n) {
        if (n < (1 << 15)) {
            print((n << 15) + 1);
        } else {
            if ((n >> 15) == (n & ((1 << 15) - 1))) {
                System.out.println((n & ((1 << 15) - 1)) );
            } else {
                System.out.print((n & ((1 << 15) - 1)) + " ");
                print(n + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
        scanner.close();
    }
}
