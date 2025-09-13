import java.util.ArrayList;
import java.util.List;

public class MergeSort{

    //merge function
    public static void merge(int[] arr , int low , int mid , int high){

        
        // Use ArrayList to store result dynamically
        List<Integer> temp = new ArrayList<>();
       //pointer
       int left = low;
       int right = mid+1;
       //itrastion
       while (left <=mid  && right<=high) {
           //chekc left and right
           if(arr[left]<=arr[right]){
           //left is samll 
           temp.add(arr[left]);
           //left go next ele
           left++;
           }else{
          //right is samller
          temp.add(arr[right]);
          right++;
           }
        
       }

       //append remaing left if they are occures
       while (left<=mid) {
        temp.add(arr[left]);
        left++;
       }

        //append remaing right if they are occures
       while (right<=high) {
        temp.add(arr[right]);
        right++;
       }

       System.out.println("result : " + temp);

       //put dowm into array => original / re-arange
       for(int i=low; i<=high ; i++){
        //put out
        arr[i] = temp.get(i-low);
       }
        
    }



    //mergeSort function => divide 
    public static void mergesort(int[]arr ,int low ,int high){
        //base case
        if(low>=high) return;

        int mid = (low+high)/2;
        //left
        mergesort(arr, low, mid);
        //right
        mergesort(arr, mid+1, high);
        //merge function
        merge(arr , low , mid , high);
    }


    public static void main(String[] args) {
        int[] arr ={6, 5,4,3,2,1};
         int low = 0;
         int high = arr.length-1;
        //function 
        mergesort(arr , low , high);

        //check array
        for(int i=low ; i<=high ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}