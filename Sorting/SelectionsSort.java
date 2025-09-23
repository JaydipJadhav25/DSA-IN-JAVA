public class SelectionsSort{
    public static void main(String[] args) {
    int[] number = { 1,2,4,7,7,5,5,6};
        // int[] arr = { 1,2,4,7,7,5,5,6};

    

    //outer loop
    for(int i =0 ; i<number.length-1; i++){
        int small = i;
         //inner  loop
         for(int j = i+1 ; j<number.length;j++){
            if(number[small] > number[j]){
                //update small
                small = j;
            }
         }
         //swap with smallest
         int temp = number[i];
         number[i] = number[small];
         number[small] = temp;
         

    }


    for(int i =0 ; i<number.length ; i++){
        System.out.print(number[i]+" ");
    }
}
}