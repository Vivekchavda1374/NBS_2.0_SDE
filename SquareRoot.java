import java.util.Scanner;

import static java.lang.Math.abs;

public class SquareRoot {
    public static double sqrt(int n , double root)  {
        double est  =  (root * root);
        double diff = abs(est - n);
        return diff / n * 100;

    }
    double sqrt(int n) {
        double root = 1.0;
        double precision = 0.00001;
        while (abs(sqrt(n, root)) > precision) {
            root = (root + n / root) / 2;
        }
        return root;
    }

    public static double buildSqrt(double n ) {
    return  Math.sqrt(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SquareRoot obj = new SquareRoot();
        double result = obj.sqrt(n);
        System.out.println(result);
        System.out.println("built function: " + buildSqrt(n));
        sc.close();
    }
}
