import java.util.Arrays;

public class Optimal {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2,1,2,3,4,5,1,2,3,100 , 102 , 101 , 100 , 102 , 103};

        //sort
        Arrays.sort(arr);

        //1
        int logest = 1; 
        int cot_curr = 0;
        int last_small = Integer.MIN_VALUE;
    
        for(int i=0 ;i<arr.length ; i++){
           
            if(arr[i]-1 == last_small){
                cot_curr++;
                last_small = arr[i];
                
            }else if (last_small != arr[i]) {
                last_small = arr[i];
                cot_curr = 1;
            }
            
       logest = Math.max(logest, cot_curr);
        }



        System.out.println("longest count is : "+logest);












    }
}
