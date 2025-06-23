public class PrimeFactorization {
    public static void main(String[] args) {
        int n = 40 ;
        System.out.println(printFactors(n));
    }
    public static boolean printFactors(int n) {
        if(n<=1) {
            return false;
        }
        StringBuilder factors = new StringBuilder();

        for (int i = 2;  i <= n; i++) {
            while (n % i == 0) {
                factors.append(i).append(" ");
                n /= i;
            }
        }
        System.out.println(factors.toString());
        return factors.length() > 0;

    }
}
