public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5};

        //loop  for every element
        for(int i =1; i<arr.length ; i++){
            if(arr[i-1] >arr[i]){
                System.out.println("array is not sorted");
                
            }
        }
                System.out.println("Aarray is sorted");

    }
}
