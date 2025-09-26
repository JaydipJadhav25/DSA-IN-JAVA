

public class singleNumber {
    public static void main(String[] args) {
         int[] arr = {1, 1 ,2 ,3 ,3 ,4, 4};
         //1 brute force
         for(int i =0; i < arr.length ; i++){
           int counter = 0;
            for(int  j =0 ; j<arr.length ; j++){
              if(arr[i] == arr[j]){
                counter++;
              }
            }
            if(counter ==1){
                System.out.println("single number is : "+ arr[i]);
                break;
            }
         }

         //2better => use map

         //3 optimal => use xor
         int xor = 0;
         for(int i =0; i < arr.length ; i++){
            xor = xor ^ arr[i];
         }

         System.out.println("this is single value is : "+ xor);
         
    }
}
