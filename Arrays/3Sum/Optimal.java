import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Optimal {
    public static void main(String[] args) {
    //    int[] arr = new int[]{-2 , -2 , -2 , -1, -1 , -1 , 0,0,0,2,2,2,2};
     // Create and initialize the ArrayList directly
        ArrayList<Integer> arr = new ArrayList<>(
            Arrays.asList(-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2)
        );

        Set<List<Integer>> result = new HashSet<>();
        // Perform reverse
        Collections.sort(arr);
       System.out.println(arr);
       int n = arr.size();   


    //    for (int i = 0; i < n; i++) {
        
    //     if(i > 0 && arr[i] == arr[i-1]) continue;

    //     int j = i+1;
    //     int k = n-1;

    //     while (j < k) {

    //         int sum = arr[i]+arr[j]+arr[k];

    //         if(sum > 0){
    //         j++;
    //         }else if(sum <0){
    //         k--;
    //         }else{
    //          //this is triplate
    //         List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
    //         //add in main
    //         result.add(triplet);
    //          j++;
    //          k--;
    //         // skip prev
    //         if(j < k & arr[j] == arr[j-1]) j++;
    //         if(j < k & arr[k] == arr[k+1]) k--;
    //         }
    //      }
    //    }




    // Assuming 'arr' is a sorted ArrayList<Integer> and 'n' is its size.
// 'result' is a List<List<Integer>> to store the triplets.

for (int i = 0; i < n; i++) {
    
    // Skip duplicate elements for the first number (arr.get(i))
    if (i > 0 && arr.get(i).equals(arr.get(i-1))) continue;

    int j = i + 1;
    int k = n - 1;

    while (j < k) {

        int sum = arr.get(i) + arr.get(j) + arr.get(k); // Use .get()

        if (sum > 0) {
            k--;
        } else if (sum < 0) {
            j++;
        } else {
            // Found a valid triplet where sum == 0
            List<Integer> triplet = Arrays.asList(arr.get(i), arr.get(j), arr.get(k));
            result.add(triplet);

            // Move both pointers inwards
            j++;
            k--;
            
            // CORRECT DUPLICATE SKIPPING for j and k:
            
            // Skip all duplicates for arr.get(j)
            while (j < k && arr.get(j).equals(arr.get(j-1))) { // Use .get() and .equals()
                j++;
            }
            
            // Skip all duplicates for arr.get(k)
            while (j < k && arr.get(k).equals(arr.get(k+1))) { // Use .get() and .equals()
                k--;
            }
        }
    }
}

System.out.println(result);


    } 
}
