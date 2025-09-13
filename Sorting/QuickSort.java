public class QuickSort {

    public static int partiton(int[] arr , int low , int high){
       
            //loop upto j is not cross to i
            int pivot = arr[low];
            int i =low;
            int j= high;
            while (i<j) {

                //find grater from left
                while (arr[i] <= pivot && i <= high-1) {
                    i++;
                }
                //find smaller in from right
                while (arr[j] > pivot && j >= low+1) {
                 j--;
                }
                 //after find index then swap
                //swap
                if(i<j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }   
            }
            //last pivot swap
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;

            //return index
            return j;
            
        }


        public static void qs(int[] arr ,int low , int high){
            //check ele is more than one
            if(low < high){
          
                int pIndex = partiton(arr, low, high);
                //left
                qs(arr, low, pIndex-1);
                //right
                qs(arr, pIndex+1, high);
            }
        }
    
    public static void main(String[] args) {
        int [] arr ={5, 4,3,2,1};

        int low = 0;
        int high = arr.length-1;
        //function
        qs(arr , low , high);


        //print
        for(int i =low ; i<=high ;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
