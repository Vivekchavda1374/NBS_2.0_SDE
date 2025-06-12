import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int n = imp.nextInt();
        printNos(n);
    }

    public static void printNos(int n) {
        if (n == 0) {
            return;
        }

        printNos(n - 1); // Go down to 1

        System.out.print(n);

        if (n != getStackTop()) {
            System.out.print(" ");
        } else {
            System.out.println();
        }
    }

    private static int getStackTop() {
        return Thread.currentThread().getStackTrace().length - 3;
    }
}
