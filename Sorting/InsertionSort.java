public class InsertionSort {
    public static void main(String[] args) {
        int[] number = {5 ,4 ,3 ,2,1};


        //outer loop
        for(int i =0 ; i<number.length ; i++){
           int current = i;

           while (current > 0 && number[current-1] > number[current]) {
            //swap its correct position
            int temp = number[current-1];
            number[current -1] = number[current];
            number[current] = temp;
            //bakc
            current--;
           }
        }


        //print
        for(int i =0 ; i<number.length ; i++){
            System.out.print(number[i]+" ");
        }
    }
}
