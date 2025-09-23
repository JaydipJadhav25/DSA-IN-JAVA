public class RotationRightD {
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
        int [] arr = {1, 2,3,4,5,6,7};
        int d =3;
        int n =arr.length;
        //create temp
         int[] temp = new int[d];
         for(int i =n-d ; i<n;i++){
            temp[i-(n-d)] = arr[i];
         }

           //print
         for(int i = 0; i<temp.length; i++ ){
            System.out.print(temp[i]);
        }
        System.out.println();
        //shifting
        // int j =0;
        // int tempp = arr[d];
        // for(int i =d; i<n; i++){
        //    arr[i] = arr[i-d];
        // //    j++;
        // }
        // arr[n-1] = tempp;



        // shifting => backword to d
            for (int i = n-1; i >= d; i--) {
                arr[i] = arr[i-d];
            }

        //putting in main arrary
 
        for(int i=0 ; i<temp.length ; i++){
            arr[i] = temp[i];
        }
        
         //print
         for(int i = 0; i<n ; i++ ){
            System.out.print(arr[i]);
        }

        /////////////////////////////////////////////////////////////////////////////////
        /// 2 . better
        ///
        System.out.println("optimal : ");
        int [] arr2 = {1, 2,3,4,5,6,7};
        reversArray(arr2, n-d, n-1);
        reversArray(arr2, 0, n-d-1);
        reversArray(arr2, 0, n-1);
           System.out.println();
         for(int i=0 ; i<n; i++){
           System.out.print(arr2[i]+" ");
        }

        
        

         


       
    }
}
