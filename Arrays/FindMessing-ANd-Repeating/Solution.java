import java.util.*;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        Collections.sort(arr);
        
        int missing = -1;
        int repeating = -1;

        for (int i = 1; i < n; i++) {
            if (arr.get(i).equals(arr.get(i - 1))) {
                repeating = arr.get(i);
            } 
            else if (arr.get(i) - arr.get(i - 1) > 1) {
                missing = arr.get(i - 1) + 1;
            }
        }

        // edge case: missing might be first or last
        if (arr.get(0) != 1) missing = 1;
        if (arr.get(n - 1) != n) missing = n;

        return new int[] { missing, repeating };
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 4));
        int n = 4;
        System.out.println(Arrays.toString(missingAndRepeating(arr, n))); // [3, 2]
    }
}
