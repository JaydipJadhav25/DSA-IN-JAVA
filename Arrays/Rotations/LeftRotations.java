public class LeftRotations {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 ,4 ,5};

        // System.out.println("my solutions");
        // int prev = arr[0];
        // for(int  i = 0 ; i<arr.length-1 ;i++){
        //     int next = arr[i+1];
        //     arr[i] = next;
        // }
        // arr[arr.length-1] = prev;
        

        System.out.println("optimal");
        int temp = arr[0];
        for(int i =1 ; i<arr.length ; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

          for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
