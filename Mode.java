import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Mode {
    public static int mode(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0 ;
        int mode = arr[0];
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > maxFrequency) {
                maxFrequency = frequencyMap.get(num);
                mode = num;
            }
        }
        return mode;

    }
    public static int[] findModes(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        for (int num : arr) {
            int freq = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, freq);
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        List<Integer> modesList = new ArrayList<>();
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == maxFrequency) {
                modesList.add(num);
            }
        }
        int[] modes = new int[modesList.size()];
        for (int i = 0; i < modesList.size(); i++) {
            modes[i] = modesList.get(i);
        }
        return modes;
    }


public static void main(String[] args) {
    int[] arr = {1, 2, 3, 3, 4, 4, 5};
    int[] modes = findModes(arr);
    
    System.out.print("Modes: ");
    for (int mode : modes) {
        System.out.print(mode + " ");
    }
    // This will print: Modes: 3 4
}
}