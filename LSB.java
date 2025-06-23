public class LSB {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(findLSB(n));
        System.out.println("Total bits: " + Integer.SIZE);
    }
    public static int findLSB(int n) {
        if (n == 0) {
        return 0;
        }
        return n&-n;
    }
}
