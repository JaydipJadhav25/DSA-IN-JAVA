import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class MapNumber {
    public static void main(String[] args) {
        
        int[] numArray = {1 ,2 , 3 ,4 , 1 ,5 ,66};
       
        //precompute
       Map<Integer, Integer> mapArray= new HashMap<>(); // Key: Integer, Value: Integer

       for(int i =0 ; i<numArray.length ; i++){
            mapArray.merge(numArray[i], 1, Integer::sum);
         }

         System.out.println(mapArray);

         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();

         System.out.println("number "+number+" count is :"+ mapArray.get(number));

       }

       

// for (int number : numArray) {
//     frequencyMap.merge(number, 1, Integer::sum);
// }
    
}
