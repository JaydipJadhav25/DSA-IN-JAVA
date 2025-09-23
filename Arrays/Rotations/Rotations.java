
public class Rotations {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 ,4 ,5};

         int prev = arr[0];
         arr[0] = arr[arr.length-1];
         for(int i =1 ; i<arr.length; i++){
           int curr = arr[i];
           arr[i] = prev;
           prev = curr;
         }


        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
