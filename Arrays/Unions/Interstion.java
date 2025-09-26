// import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Interstion {
    public static void main(String[] args) {
        //    Set<Integer> union = new HashSet<>();
        

        int[] a = {1, 2, 2, 3, 4, 5 , 6};
        int[] b = { 2,3, 3, 5 , 6 , 6 , 7};

        //1. brute force 
        //basically pick one and check it persent in seocnd array if persent so that add in array
        //start from frist
        // int track = 0;
        // for(int i = 0; i<a.length ; i++){
        //     //inner loop
        //     int current = a[i];
        //     int count = 0;
        //     for(int j = track ; j<b.length ; j++){

        //         //check and add
        //         if(current == b[j] && count == 0){
        //             //add
        //             union.add(current);
        //             count++;
        //             track++;
        //         }
        //     }

         
        // }
        //print
        // for(Integer ele : union){
        //     System.out.print(ele+' ');
        // }

        //brute force =>use visited array
        //visited array
        // int[] visite = new int[b.length];
           Set<Integer> interssection = new HashSet<>();

           //outer loop
        //    for(int i =0 ; i<a.length ; i++){
        //     //inner
        //         for(int j =0 ; j<b.length ; j++){
        //             //check corresponsiting and also prev use or not

        //             if(a[i] == b[j] && visite[j] == 0){
        //                 //add
        //                 interssection.add(a[i]);
        //                 visite[j] = 1;
        //                 break; // no need to run loop exis
        //             }

        //         }
        //    }


           //optimal solution
           int an = a.length;
           int bn = b.length;
           int i=0;
           int j =0;

           while (i<an && j<bn) {

            //check
            if(a[i] < b[j]){
                //no matach
                i++;
            }else if(b[j] < a[i]){
                //no match just move
                j++;
            }else{
                //match
                //so add nad move
                interssection.add(a[i]);
                i++;
                j++;
            }

            
           }







             //print
        for(Integer ele : interssection){
            System.out.print(ele +" ");
        }




        
    }
}
