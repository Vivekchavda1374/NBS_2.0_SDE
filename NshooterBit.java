import java.util.Scanner;

public class NshooterBit {
    public static int nshooters(int n){
        return n>>1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shooters: ");
        int n = sc.nextInt();
        int result = nshooters(n);
        System.out.println("Number of shooters : " + result);
    }
}
