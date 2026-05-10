import java.util.*;

public class ToUpperCaseString {
      
    public static String toConverIntoUpperCase(String str){

        StringBuilder newStr = new StringBuilder("");

        // append first letter
        newStr.append(str.charAt(0));

        //loop on string
        for(int i = 1 ; i < str.length(); i++){
            //append one by one
            //check space
            if(str.charAt(i) == ' '){
                //append space 
             newStr.append(str.charAt(i));
              System.out.println(i);
             
             // next element is first element of string
             i++;
                
             
             if( i >= str.length()){
                  return newStr.toString();

             }else{
            
                newStr.append(Character.toUpperCase(str.charAt(i)));
             }

            }else{


                 if(i >= str.length()){

                  return newStr.toString();
                  
             }else{

                 newStr.append(str.charAt(i));
             }

            }
            

        }


        //return new string

        return newStr.toString();

    }

     public static void main(String[] x){
       
      
        System.out.println(toConverIntoUpperCase("I am jaydip "));


     }
}
