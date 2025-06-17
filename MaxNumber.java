import java.util.*;

public class MaxNumber {

    // Method to take input from the user and return an integer ArrayList
    public static List<Integer> inputList() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Initialize list
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        return list;
    }

    // Method to find the maximum element in the list
    public static int maxInList(List<Integer> list) {
        // Initialize max with first element
        int max = list.get(0);

        // Loop through the list to find the maximum
        for (int num : list) {
            max = Math.max(max, num);
        }

        return max;
    }

    // Main method
    public static void main(String[] args) {
        // Take input
        List<Integer> list = inputList();

        // Find and print the maximum value
        System.out.println(maxInList(list));
    }
}
