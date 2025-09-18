import java.util.HashMap;
import java.util.Map;

public class MajorityNumber {
    //  public static int findMajority(int[] arr, int n) {
	// 	// Write your code here.
    //     //largets valuse
    //      int maxValue = Integer.MIN_VALUE; // Initialize with the smallest possible int value
    //      Map<Integer, Integer> mapArray = new HashMap<>(); 

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > maxValue) {
    //             maxValue = arr[i];
    //         }
    //     }
    //     // System.out.println("Maximum value: " + maxValue);

        
    //     //freq array
    //     // int[] freq = new int[maxValue+1];

	//   //fill
	// //   for(int i =0 ; i<n;i++){
	// // 	  //stor
	// // 	  freq[arr[i]]++;
	// //   }



    //   //use map
    //   for(int i =0 ; i<n;i++){
	// 	  //stor in map key => value , value => freq
    //     mapArray.merge(arr[i], 1, Integer::sum);
	//   }

    
    // //   System.out.println("map : " + mapArray);
    //   System.out.println("map : " + mapArray.get(3));

     



     
    // //int cond = (int)Math.Floor(n / 2); // cond will be 2 
    // // The error happens because in Java, Math.floor() works only with floating-point types (double), not with integers
    //    int cond = n / 2;  // no need for Math.floor

	//     int largest = -1;

    //     System.out.println("cond is: " + cond);

    // //    for(int i =0 ; i<freq.length ; i++){
    // //     System.out.print(freq[i] +" ");
    // //    }

	//   //find
	//   for(int i=0 ; i<arr.length ; i++){
	// 	  //check
    //   System.out.println("map : " + mapArray.get(3));           
	// 	  if(mapArray.get(arr[i]) >= cond){

	// 		  largest = arr[i];

	// 	  }
	//   }

	// return largest;
	// }





     public static int findMajority(int[] arr, int n) {
        Map<Integer, Integer> mapArray = new HashMap<>();

        // store frequencies
        for (int i = 0; i < n; i++) {
            mapArray.merge(arr[i], 1, Integer::sum);
        }

        int cond = n / 2; // majority condition
        int largest = -1;

        // check each entry
        for (Map.Entry<Integer, Integer> entry : mapArray.entrySet()) {
            if (entry.getValue() > cond) {
                largest = entry.getKey();
                break; // only one majority possible, can exit early
            }
        }

        return largest;
    }

      public static int findMostFrequent(int[] arr, int n) {
        Map<Integer, Integer> mapArray = new HashMap<>();

        // store frequencies
        for (int i = 0; i < n; i++) {
            mapArray.merge(arr[i], 1, Integer::sum);
            
        }

        int maxFreq = 0;
        int element = -1;

        // find the element with the highest frequency
        for (Map.Entry<Integer, Integer> entry : mapArray.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                element = entry.getKey();
            }
        }

        return element;
    }
    public static void main(String[] args) {
        
        int[] arr = new int[]{2, 3, 9,2 ,2 ,2 ,1};
        System.out.println("finde mejority : "+findMajority(arr, arr.length));
        //  int[] data = {1, 2, 3, 2, 2, 5, 1, 1, 1};
         int[] data = { 3, 4 , 1 ,2 , 4 };
        System.out.println(findMostFrequent(data, data.length)); // Output: 1
       
    }
}
