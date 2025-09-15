// import java.util.Arrays;

public class BinarySearch {
    public static int binay(int[] arr , int n , int key){
      int start =0 ;
      int end = n-1;
      int index = -1;

      while (start<=end) {
          int mid  = (start+end)/2;
        //   System.out.println("run...."+ mid);
        //check
        // if(arr[mid] == key){
        //     return mid;//mid 
        // }else if(arr[mid]<key){
        //     start = mid+1;
        // }else if(arr[mid]>key){
        //     end = mid-1;
        // }




        if(arr[mid] == key){
            return mid;//mid 
        }
        
        if(arr[mid]<key){
            start = mid+1;
        }else{
            end = mid-1;
        }
    //  break;
      }



      return index; //not found
    }
    public static void main(String[] args) {
         int[] arr = new int[]{1 ,2, 3, 4, 5, 6, 7 ,8,9};

         //sort arry
        // Arrays.sort(arr);
       System.out.println( binay(arr, arr.length , 100));



         
        

       
         
    }
}
