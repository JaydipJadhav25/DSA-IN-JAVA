// package majorityElements;

import java.util.ArrayList;
import java.util.List;

public class Optimal {
   public static void main(String[] args) {
      int[] arr = new int[]{2 ,1 , 1, 3,1,4,5,6};
        // ArrayList<Integer> result = new ArrayList<>();
         List<Integer> result = new ArrayList<>();
      
        int cot1 = 0; 
        int cot2 = 0;
        int e1 = Integer.MIN_VALUE;  
        int e2 = Integer.MIN_VALUE;
        
        for(int i=0 ; i<arr.length ; i++){

             if(cot1 == 0 && arr[i] != e2){
                e1 = arr[i];
                cot1 =1;
             }else if(cot2 == 0 && arr[i] != e1){
                e2 = arr[i];
                cot2 =1;
             }else if(e1 == arr[i]) cot1++;
             else if(e2 == arr[i]) cot2++;
             else{
                cot1--;
                cot2--;
             }

        }
 
        int mini = ((arr.length)/3)+1;
        //chech e1 nadd e2
        cot1 = 0 ;
        cot2 = 0;
        //check agin 
        for (int i = 0; i < arr.length; i++) {
            if(e1 == arr[i])cot1++;
            if(e2 == arr[i])cot2++;
        }
        //add if done otherwise skip
        if(cot1 >= mini){
            result.add(e1);
        }
         if(cot2 >= mini){
            result.add(e2);
        }

        //print result
        System.out.println(result);

   }



        
}
