public class CountingSort {
    public static void main(String[] args) {
        int[] arr ={1,4, 3,2,4,3,7};

        //find max
        int max = 0;
        for(int i =0 ; i<arr.length ; i++){
            if(max <arr[i]){
                max = arr[i];
            }
        }
     System.out.println("Max number is :" + max);
     //dif count array with max
      int[] count = new int[max+1];
      
      //outer loop
      for(int i =0 ; i<arr.length ; i++){
        //update in cout
        count[arr[i]]++;
      } 
        //loop to storting in main aray
        int j =0 ;
          for(int i =0 ; i<count.length ; i++){
            while (count[i] > 0) {
                arr[j] =i;
                j++;
                count[i]--;//drecess
            }

          }

      

      //print original array
       for(int i =0 ; i<arr.length ; i++){
        System.out.println(arr[i]);
      }
    }
}
