// package SubArray;

public class SubArray {
        public static void main(String[] args) {
            // int[] arr = {1,2, 1, 1,3, 4, 5, 6};
            // //1.brute force
            // //outer loop
            // int len = 0;
            // for(int i=0 ; i<arr.length ; i++){
            //     int start = i;
            //     //inner loop
            //     for(int j = i; j<arr.length; j++){
            //         int end = j;
            //         //print sun array
            //         int s = 0;
            //         for(int k= start; k<=end ;k++ ){
            //             //print
            //             // System.out.print(arr[k]+" ");
            //             s +=arr[k]; //addition of all element
              
            //          if(s == k){
            //             //update max
            //            len  = Math.max(len, j-i+1);
            //          }
            //         }
    
            //     }
     
            // }
            // System.out.println("len :" + len);

        // int[] arr = {1, 2, 1, 1, 3, 4, 5, 6};
        int[] arr = {2 ,3 ,5};
        int target = 5;//sum is target so find subarray
        int len = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
        //         int s = 0;
        //         for (int k = i; k <= j; k++) {
        //             s += arr[k];
        //         }
        //         if (s == target) {
        //             len = Math.max(len, j - i + 1);
        //         }
        //     }
        // }

        // System.out.println("len : " + len);

            //2.better

        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for (int j = i; j < arr.length; j++) {
                 //add new element and sum it
                 s += arr[j];
                 //check equal and find len of sub array
                 if(target == s){
                    //update len
                    System.out.println(i+" :"+j);
                    len = Math.max(len, j-i+1);//why do this
                    System.out.println("len : "+ len);
                 }
            }
        }

        System.out.println("len : " + len);//return maximun len of sub array


        }
}
