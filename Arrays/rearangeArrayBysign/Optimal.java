// package rearangeArrayBysign;

public class Optimal {
      public static void main(String[] args) {
          int[] arr = {1  ,-10, 5 ,-1, 2, -3, 0, -2};
    
        int[] ans = new int[arr.length];
        int pos = 0;
        int neg = 1;

        for(int i=0 ; i<arr.length ; i++){
            //posivite
            // if(arr[i] >0){
            //     ans[pos] = arr[i];
            //     pos +=2;
            // }else{
            //     //nigative
            // ans[neg] =arr[i];
            // neg +=2;
            // }

             if(arr[i] <0){
                    //nigative
            ans[neg] =arr[i];
            neg +=2;
               
            }else{
            
             ans[pos] = arr[i];
                pos +=2;
            }
            
        }


        //print
        for(int i=0 ; i<ans.length ;i++){
            System.out.print(ans[i]+" ");
        }

        
    
      }


}
