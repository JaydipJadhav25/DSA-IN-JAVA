public class ParisfArrays {
    public static void main(String[] args) {
         int[] arr = new int[]{1 ,2, 3, 4, 5, 6, 7 ,8};
        

         //outer loop
         for(int i=0 ; i<arr.length; i++){
            System.out.println(i);
            //inner loop
            int crr = arr[i];
            //   for(int j=i ; j<arr.length-1 ; j++){
            //     System.out.print("("+crr+","+arr[j+1]+") ");
            //   }
                             //arr.length is handle properly index flow
               for(int j=i+1 ; j<arr.length; j++){
                System.out.println(j);
                System.out.print("("+crr+","+arr[j]+") ");
              }
              System.out.println();
         }
    }
}
