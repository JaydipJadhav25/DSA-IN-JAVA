public class RotationOnD {

    public static void reversArray(int[] arr , int start  , int end){

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 ,4 ,5 ,6, 7};
        int d =4;
        int n =arr.length;
         //1 . brute fourc
        //create temp array
        int[] temp = new int[d];

        //add elemeant in array
        for(int i =0 ; i<d ; i++){
            temp[i] = arr[i];
        }

        //shifting // start from 4 , 5 ,6 
        for(int i =d ; i<arr.length ; i++){
            //placed at start postion
            arr[i-d] = arr[i];
        }

        //push back temp element
        // int j =0;
        // for(int i = n-d ; i<arr.length ; i++){
        //     arr[i] = temp[j];
        //     j++;
        // }

        
        for(int i = n-d ; i<arr.length ; i++){
            arr[i] = temp[i-(n-d)];
          
        }


           
         //print
         for(int i = 0; i<arr.length ; i++){
         System.out.print(arr[i]+" ");
        }
        //optimal for space extrac space not use
        System.out.println("optimal......");
        int[] arr2 = {1, 2 ,3 ,4 ,5 ,6, 7};
        int n2 = arr2.length;
        reversArray(arr2, 0, d-1);
        reversArray(arr2, d, n2-1);
        reversArray(arr2, 0, n2-1);

         //print
         for(int i = 0; i<arr2.length ; i++){
         System.out.print(arr[i]+" ");
        }








       





         

        
    }
}
