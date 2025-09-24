// package Unions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionsSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 4 ,5};
        int[] arr2 = { 2, 3, 4, 4 ,5 , 6};

          // Set<Integer> numSet = new HashSet<>();
          // System.out.println("brute force :");

          //add elemt
          //array 1
          // for(int i =0; i<arr1.length ; i++){
          //   numSet.add(arr1[i]);
          // }
          //  //array 2
          // for(int i =0; i<arr2.length ; i++){
          //   numSet.add(arr2[i]);
          // }



          //define array
          // int[] union = new int[numSet.size()];


          //   int idx =0;
          // for(Integer num : numSet){
          //    union[idx++] = num;
          // }

          //print
          //  for(int i =0; i<union.length ; i++){
          //  System.out.print(union[i]+" ");
          // }




          //2. two pointer apprech
          // Set<Integer> union = new HashSet<>();
            ArrayList<Integer> union = new ArrayList<>(); 
  
          int n1 =arr1.length;
          int n2 =arr2.length;
          
          int i =0;
          int j =0;

          //check for frist array
          while (i<n1 &&  j <n2) {
            if(arr1[i] < arr2[j]){
                           //check last element is or not 
                           int last = union.size()-1;
                           //but allow frist time push
                           if(union.size() == 0 || union.get(last) != arr1[i]){
                            //push
                            union.add(arr1[i]);
                           }
                           //already persent
                           i++;

            }else{
              //arr2 elementis smaller
            int last = union.size()-1;
             if(union.size() == 0 || union.get(last) != arr2[j]){
              //add
              union.add(arr2[j]);
             }
               
                j++;
            }
            
          }

          //reamin element in arr2
          while (j<n2) {
            int last = union.size()-1;
             if(union.size() == 0 || union.get(last) != arr2[j]){
              //add
              union.add(arr2[j]);
             }    
                j++;
          }


           //reamin element in arr1
          while (i<n1) {
            int last = union.size()-1;
             if(union.size() == 0 || union.get(last) != arr1[i]){
              //add
              union.add(arr1[i]);
             }    
                i++;
          }


          //print element in arraylist 
           for (int k = 0; k< union.size(); k++) {
                System.out.println(union.get(k)+" ");
            }


        

    }
}
