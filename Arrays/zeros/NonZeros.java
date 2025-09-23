// package zeros;

import java.util.ArrayList;

public class NonZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0 ,2 ,3, 2,0,0,4, 5,1};
        // int[] hash = new int[arr.length];

        //loop and pick up non-zero
        // int j =0;
        // for(int i =0; i<arr.length;i++){
        //   if(arr[i] != 0){
        //     hash[j] = arr[i];
        //     j++;
        //   }
        // }

        //copy in main
        // for(int i= 0; i<hash.length ; i++){
        //     arr[i] = hash[i];
        // }
        //print
         for(int i= 0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

       System.out.println();
        //use array list
        ArrayList<Integer> temp = new ArrayList<>();

        //add non zero
        // int j = 0;
        // for(int i =0; i<arr.length;i++){
        //     if(arr[i] != 0){
        //         //add
        //         temp.set(j, arr[i]);
        //         j++;
        //     } 
        // }
        
        //add in arr nonzero

        // while (j < arr.length) {
        //     temp.set(j, 0);
        //     j++;
        // }

        ///case 2 
        
           for(int i =0; i<arr.length;i++){
            if(arr[i] != 0){
                //add
                temp.add(arr[i]);
            } 
        }

        //idx
        int nz = temp.size();
        System.out.println(nz);
        for(int i = 0 ; i<nz ; i++){
            arr[i] =  temp.get(i);
        }

        //fill all zeros
        for(int i = nz ; i<arr.length ; i++){
            arr[i] =0;
        }
        
          //print
          for(int i= 0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

       System.out.println();

        
        
        
        

    }
}
