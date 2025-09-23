
public class Rotations {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 ,4 ,5};
        System.out.println("right rotation");
        int n =arr.length;
        //  int prev = arr[0];
        //  arr[0] = arr[arr.length-1];
        //  for(int i =1 ; i<arr.length; i++){
        //    int curr = arr[i];
        //    arr[i] = prev;
        //    prev = curr;
        //  }


        // for(int i=0 ; i<arr.length ; i++){
        //     System.out.print(arr[i]+" ");
        // }


        //optimal
        int temp = arr[n-1];//last stor
        for(int i = n-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] =temp;
         for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
