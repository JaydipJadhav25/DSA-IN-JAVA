// package Lerader;

import java.util.ArrayList;
import java.util.Collections;

public class Optimal {
    public static void main(String[] args) {
        int[] arr = new int[]{10 , 22  , 12, 2, 3, 0, 6};
         ArrayList<Integer> leders = new ArrayList<>();
         int max = Integer.MIN_VALUE;
        for (int i = arr.length-1; i  >=0; i--) {
            //check current is max if max update max
            if(arr[i] > max){
                max = arr[i];
                //add in list
                leders.add(max);
            }
        }
        
        //revers
        Collections.reverse(leders);

         //print
        for(Integer led : leders){
            System.out.print(led+" ");
        }

    }
}
