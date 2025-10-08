package 4sum;

public class Better {
        public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                Set<Long> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k]; // ✅ use long
                    long fourth = (long) target - sum;              // ✅ use long
                    if (seen.contains(fourth)) {
                        List<Integer> quadruplet = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        Collections.sort(quadruplet);
                        result.add(quadruplet);
                    }

                    seen.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        
    }
}
