import java.util.*;

public class Better {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> result = new HashSet<>();

        // Loop through each element
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int third = -(arr[i] + arr[j]);

                // If we’ve seen the complement, we found a triplet
                if (seen.contains(third)) {
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(triplet); // sort to handle uniqueness
                    result.add(triplet);
                }
                seen.add(arr[j]);
            }
        }

        return new ArrayList<>(result);
    }
}
