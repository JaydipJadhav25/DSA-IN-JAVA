
public class ReversArray {

    public static void print(int i  , int[] arr , int n ){
        //upto middler
          if(i >=n/2) return;

          //swap
          int temp = arr[i];
          arr[i] = arr[n-i-1];
          arr[n-i-1] = temp;

          //call for next
          
          print(i+1, arr, n);
    }


    public static void main(String[] args) {
        System.out.println(" revers array !");
           //int[5] numbers = new int[]; // Declares an integer array 
                int[] numbers = {1, 2, 3, 4, 5}; // Declares and initializes an array with specified values
            System.out.println("befor");
           for(int i=0 ; i<numbers.length; i++){
            System.out.print(numbers[i]);
           }
System.out.println();
                print(0 , numbers , numbers.length);

                System.out.println("after ...");

            for(int i=0 ; i<numbers.length; i++){
            System.out.print(numbers[i]);
           }




    }
}
