import java.util.*;

public class Solution {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

        Set<List<Integer>> result = new HashSet<>();

        // Loop through each element
        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = K - (arr[i] + arr[j]);

                // If we’ve seen the complement, we found a triplet
                if (seen.contains(third)) {
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(triplet); // sort to handle uniqueness
                    result.add(triplet);
                }
                seen.add(arr[j]);
            }
        }

        // Convert result to ArrayList<ArrayList<Integer>>
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (List<Integer> triplet : result) {
            ans.add(new ArrayList<>(triplet));
        }

        return ans;
    }

    // For testing
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        int K = 0;

        ArrayList<ArrayList<Integer>> ans = findTriplets(arr, n, K);
        System.out.println(ans);
    }
}
