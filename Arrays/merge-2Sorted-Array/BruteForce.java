//package merge-2Sorted-Array;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteForce {
    public static void mergeArrays(int[] a , int[] b , int n , int m ){
       
        int[] ans = new int[n+m];//store result
        int left =0;
        int rigth = 0;
        //itreav until not end loops
        int idex=0;
        while (left < n && rigth <m) {
            //check and swap
            if(a[left] < b[rigth]){
                //left in small so add
                ans[idex++] = a[left];
                left++;
            }else{
                //right small add and update
                ans[idex++] = b[rigth];
                rigth++;
            }
            
        }

        //remaing of a
        while (left < n) {
             ans[idex++] = a[left];
            left++;
        }

         //remaing of b
        while (rigth < m) {
             ans[idex++] = b[rigth];
            rigth++;
        }
        //done
        // System.out.println(Arrays.toString(ans));


        //update in two array
        for (int i = 0; i < n+m; i++) {
            //add in first array a 
            if(i<n){
                 a[i] =ans[i]; 
            }
            else b[i-n] = ans[i];
        }

         return;

    }
    public static void main(String[] args) {
        int[] a= new int[]{1 ,3,5,7};
        int[] b= new int[]{0 ,2,6,8,9};
        mergeArrays(a, b, a.length, b.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
    
}
