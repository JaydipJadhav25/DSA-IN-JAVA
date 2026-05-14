import java.util.*;

public class StringCompresion{
    public static void main(String[] x){
        Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
        
         //define var
         int count = 1;
         char letter = input.charAt(0);
         
          
        //loop on it
        for(int i = 1; i< input.length(); i++){
            //check if not same 

             if(letter != input.charAt(i)){
              //print all past data
               System.out.print(letter+""+ count);
                //update with current latter
                letter = input.charAt(i);
                 count = 1; 
             }else{
                 //current latter same
                count++;
              }
         }
          //for last letter
               System.out.print(letter+""+ count);

        
    }
}