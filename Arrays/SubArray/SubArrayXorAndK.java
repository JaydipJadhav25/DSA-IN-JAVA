import java.util.HashMap;

public class SubArrayXorAndK {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int xr =0 ;
        int count = 0;
        int k = 6;
        //xr  , count
      HashMap<Integer , Integer> hash = new HashMap<Integer , Integer>();
      //init
      hash.put(0, 1);
     
      //lop
      for (int i = 0; i < arr.length; i++) {
        xr = xr ^arr[i];
        //requrid
        int x = xr ^ k;
        //check in map
        // count += hash.get(x) ;
        // //update xr in hash
        // hash.merge(xr, 1, Integer::sum);


         //  Check in map and update count (FIXED: use getOrDefault to prevent NullPointerException)
            // If 'x' is in the map, add its count to the total. If not, add 0.
            count += hash.getOrDefault(x, 0);
            
            //  Update the frequency of the current prefix XOR (P_i) in the map
            // Adds 'xr' to the map with a count of 1, or increments the existing count by 1.
            hash.merge(xr, 1, Integer::sum);
      }


    System.out.println("count is : "+count);
    }
}
