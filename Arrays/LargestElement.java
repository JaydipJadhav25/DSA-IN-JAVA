public class LargestElement {
   
    public static void main(String[] args) {
        int largest = -1;
        System.out.println("largest element is :"+ largest);

        // int[] arr = new int[]{1,2,3,4,5,6,7,8 ,1, 90};
        int[] arr = new int[]{2, 3, 9, 2, 2};
        //finde
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] >largest){
                largest = arr[i];
            }
        }
        System.out.println("largest element is :"+ largest);




    }
}
