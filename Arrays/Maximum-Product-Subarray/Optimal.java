// package Maximum-Product-Subarray;

public class Optimal {
    public static void main(String[] args) {
        int[] arr = new int[]{2 ,3 ,-2 ,4};

        int pre = 1;
        int suff = 1;
        int ans =  Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            
            if (pre == 0) {
                pre =1;
            }
            if (suff == 0) {
                suff = 1;
            }
            pre = pre* arr[i];
            suff = suff * arr[n-i-1];
            //update ans
            ans = Math.max(ans, Math.max(pre, suff));
        }
        System.out.println("maximum count is : "+ ans);
    }
    
}
