// package frist-last-occurences;

public class Optimal {

     public static int findFirst(int[] arr , int x){
                 int first = -1;

        int low = 0;
        int high = arr.length -1;
        while (low<= high) {
            int mid = (low+high)/2;
            //check
            if(arr[mid]== x ){
                first = mid;
                //finde in left update high
                high = mid-1;
            }else if(arr[mid] < x){
                //finde in rigth
                low = mid+1;
            }else{
                //mid in grater
                high = mid-1;
            }
            
        }  

        return first;
     }





       public static int findLast(int[] arr , int x){
        int last = -1;

        int low = 0;
        int high = arr.length -1;
        while (low<= high) {
            int mid = (low+high)/2;
            //check
            if(arr[mid]== x ){
                last = mid;
                //finde in rigth update high
                 low = mid+1;

                 //check
                 if(arr[mid] > arr[last]) break;

            }else if(arr[mid] < x){
                //finde in rigth
                low = mid+1;
            }else{
                //mid in grater
                high = mid-1;
            }
            
        }  

        return last;
     }


    public static void main(String[] args) {
           int[] arr = new int[]{ 2,8,8,8,8,8,11,13};
        // int x = 82;
        // int x = 10;
        int x = 11;


        int first = findFirst(arr, x);
        int last = findLast(arr , x);
        
        System.out.println("frist : "+ first+" : last :"+ last);
        



    }
    
}
