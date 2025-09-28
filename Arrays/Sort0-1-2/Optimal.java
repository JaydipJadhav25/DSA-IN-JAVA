public class Optimal {
    public static void main(String[] args) {
    int [] arr = new int[] {1 ,2, 0 ,0 ,1,1 , 2,0};
    int low = 0;
    int mid =0;
    int high = arr.length-1;
    //loop until mid cross to high
    while (mid <= high) {
         //check
         if(arr[mid] == 0){
            //swap this low
            int temp = arr[mid];
            arr[mid] = arr[low];
            arr[low] = temp;
            
            mid++;
            low++;
             

         }else if(arr[mid]==1){
            //skip
            mid++;
         }else{
            //mid =2
            //swap with high
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;

            // mid++;//no becaue  we need to check new element
            high--;
         }
         System.out.println(mid +":"+high);
    }
    //print
    for(int i=0 ; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
    }
}
