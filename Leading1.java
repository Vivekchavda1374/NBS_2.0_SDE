public class Leading1 {
    public static void main(String[] args) {
        int n =1;
        System.out.println("Number of 1 bits: " + countOnes(n));
        System.out.println("Total bits: " + Integer.SIZE);
        int a = 1;
        a<<=31;
        System.out.println("Value of a after left shift: " + a);
    }
    public static int countOnes(int n) {
        int count = 0;
        while(n != 0) {
            if ((n & 1) == 1) count++;
            n >>>= 1;
        }
        return count;
    }
}