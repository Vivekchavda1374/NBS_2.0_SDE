public class PrimeCheck {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 97;
        if (isPrime(number))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}
