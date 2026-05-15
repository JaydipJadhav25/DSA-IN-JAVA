import java.util.Scanner;

public class PreaticeNo1 {
    public static void main(String[] x){
        Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();

        String vowels = "aeiou";
        int count = 0;

        for(int i  =0 ; i< input.length() ; i++){
            // for(int j  = 0 ; j < vowels.length() ; j++){
            //     //check
            //     if(input.charAt(i) == vowels.charAt(j)) {
            //      count++;
            //     }
            // };
            
            //check condition
            char ch = input.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
               count++;
            }



        }

        System.out.println(count);


    }
}
