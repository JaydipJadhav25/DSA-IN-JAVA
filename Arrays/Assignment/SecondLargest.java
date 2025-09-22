public class SecondLargest {
 
    public static void main(String[] args) {
        int[] arr = { 1,2,4,7,7,5,5,6};



        //1 . brute force method//////////////////////////////////
        //1.sort =>selection sort
        // System.out.println("sort :");
        //outer loop
       
       
        // for(int i=0 ; i<arr.length ; i++){
        //  int  min = i;
        //   //inner loop
        //   for(int j = i+1 ; j<arr.length ; j++){
        //    //finde smallest
        //    if(arr[min] > arr[j]){
        //     min = j;
        //    }

        //   }

        //   //swap
        //   int temp = arr[min];
        //   arr[min] = arr[i];
        //   arr[i] = temp;


        // }

        //   //print 
        //     for(int i =0 ; i<arr.length;i++){
        //         System.out.print(arr[i]+" ");
        //     }
              
        //     //frist largesr
        //     int largest = arr[arr.length-1];
        //     //find second largest
        //     for(int i = arr.length-2 ; i>=0; i--){
        //         //chekc if not same vlaue
        //         if(arr[i] !=largest ){
        //             largest = arr[i];
        //             break;
        //         }
        //     }

        // System.out.println("second largest : " + largest);



        //2 .better //////////////////////////////////

        int largest =0;
        //frist
        for(int i=0 ; i<arr.length ;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        //scond pass
        int secondlargest = -1;
        for(int i =0 ; i<arr.length ;i++){
            //check
            if(secondlargest <arr[i] && arr[i] != largest){
                secondlargest = arr[i];
            }
        }

        System.out.println("second largest : "+ secondlargest);


        //method 3 






    }
    

}
