import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Optimal {
 public static void main(String[] args) {
        // Initial set of intervals (unsorted)
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        
        // 1. Sort the given intervals by the start time (index 0)
        // O(N log N) step
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        
        // After sorting: arr is now {{1, 3}, {2, 6}, {8, 10}, {15, 18}}
        
        // Define the list to hold the merged intervals
        List<List<Integer>> ans = new ArrayList<>();

        // 2. Linear Scan and Merge Loop - O(N) step
        for (int i = 0; i < arr.length; i++) {
            
            // Check for two conditions (separated for clarity):
            // Condition 1: The result list is empty (must add the first interval).
            // Condition 2: The current interval (arr[i]) does NOT overlap with the last merged interval.
            // No overlap means arr[i]'s start is greater than the last merged interval's end.
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                
                // CREATE new interval: 
                // Since arr[i] is an int[], we must convert it to a List<Integer> to match the 'ans' type.
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            
            } else {
                
                // MERGE/UPDATE existing interval:
                // Overlap exists (arr[i][0] <= lastMerged.get(1)).
                List<Integer> lastMerged = ans.get(ans.size() - 1);
                
                // Calculate the new end time (max of the two end times)
                int newEnd = Math.max(lastMerged.get(1), arr[i][1]);
                
                // Fix: You must use .set() to update an element in an ArrayList, not the assignment operator '='.
                lastMerged.set(1, newEnd);
            }
        }

        // Expected output: [[1, 6], [8, 10], [15, 18]]
        System.out.println("Merged List: " + ans);
    }
}
