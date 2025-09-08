public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 5 ,4 ,3 ,2, 1};

        //1./////////////////////////////////////////////////
        //outer loop
        // for(int i = arr.length-1; i>=0; i--){
        // //inner loop
        //   for(int j = 0 ; j<=i-1 ; j++){
        //     //check
        //     if(arr[j] >arr[j+1]){
        //         //swap
        //         int temp = arr[j];
        //          arr[j] = arr[j+1];
        //          arr[j+1] = temp;
        //     }
        //   }
            

        // }

      
        //print
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

             System.out.println();

        //2 ./////////////////////////////////////
        //outer loop
        for(int i = 0 ; i<arr.length-1; i++){
            //inner loop
            for(int j =0; j<arr.length-1-i; j++){
                //chekc
                if(arr[j] >arr[j+1]){
                    //swap
                int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
                }
            }
        }
    

         //print
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
