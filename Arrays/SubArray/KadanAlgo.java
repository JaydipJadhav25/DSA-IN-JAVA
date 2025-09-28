import java.util.Arrays;

public class KadanAlgo {
    public static void main(String[] args) {
 
         int[] arr = new int[]{9,9,9,9};

        

        int first= Integer.MIN_VALUE;
		int second = -1;
        //sort
        Arrays.sort(arr);

       //loop
	   for(int i=0 ; i<arr.length; i++){
		   //finde max
		   if(first < arr[i]){
			   second = first;
			   first = arr[i];
		   }
	   }

System.out.println(first+" "+ second);

    }
}
