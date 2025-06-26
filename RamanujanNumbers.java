import java.util.*;

public class RamanujanNumbers {
    public static List<List<Integer>> findRamanujanNumbers(int limit) {
        int[] cubes = new int[limit + 1];
        for (int i = 0; i <= limit; i++) {
            cubes[i] = i * i * i;
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int a = 1; a <= limit; a++) {
            for (int b = a + 1; b <= limit; b++) {
                int sum = cubes[a] + cubes[b];
                int c = b + 1;
                int d = limit;
                while (c < d) {
                    int sum2 = cubes[c] + cubes[d];
                    if (sum2 == sum) {
                        result.add(Arrays.asList(sum, a, b, c, d));
                        c++;
                        d--;
                    } else if (sum2 < sum) {
                        c++;
                    } else {
                        d--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int limit = 50;
        List<List<Integer>> ramanujanNumbers = findRamanujanNumbers(limit);
        for (List<Integer> entry : ramanujanNumbers) {
            System.out.println(entry.get(0) + ": (" + entry.get(1) + ", " + entry.get(2) + ", " + entry.get(3) + ", " + entry.get(4) + ")");
        }
    }
}