public class ReveresArray {
    public static void main(String[] args) {
         int[] arr = new int[]{1 ,2, 3, 4, 5, 6, 7 ,8};
         // int[] arr2 = new int[arr.length];

         //method 1
         // int j =0;
         // for(int i = arr.length-1; i >=0 ; i--){
         //    arr2[j] = arr[i];
         //    j++;
         // }

         // //passing
         // for(int i =0 ; i<arr2.length ; i++){
         //    arr[i]=arr2[i];
         // }

         //method 2 => not use extra space
         //befor
           for(int i =0 ; i<arr.length; i++){
          System.out.print(arr[i]+" ");
         }
         int start = 0 ; 
         int end = arr.length-1;
         while (start < end) {
            //swap start to end
            // System.out.println("Start" + start + " end : "+end);
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }

         //print
         System.out.println();
          for(int i =0 ; i<arr.length ; i++){
          System.out.print(arr[i]+" ");
         }
    }
}
