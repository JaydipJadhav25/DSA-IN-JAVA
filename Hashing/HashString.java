import java.util.Scanner;

public class HashString {
    public static void main(String[] args) {
   
        // this is brute focers TC=O(n*n)
     String s1 = "jaydip";


    //  int[] hash = new int[26]; //only for lower case letters


    
     //1.brute force
        // char target = 'l';   // use single quotes for char
        // int counter = 0;

        // for (int i = 0; i < s1.length(); i++) {
        //     if (s1.charAt(i) == target) {
        //         counter++;
        //     }
        // }

        // System.out.println("char count is : " + counter);


        // int a = s1.charAt(0) -'a';
        // System.out.println(a);

        //2. Char hash
        // for(int i =0 ; i<s1.length() ; i++){
        //   //mapping char with index
        //  hash[s1.charAt(i) -'a'] +=1;
        // }


        //print hash
        // System.out.println("Char Hash : ");
        // for(char i='a'; i<='z'; i++){
        //         System.out.print(i+" ");
        // }
        // System.out.println();
        // for(int i=0 ; i<hash.length ;i++){
        //     System.out.print(hash[i]+" ");
        // }

        //result
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0);


        // System.out.println("char is : "+word + " count :"+hash[word-'a']);
        


        
        //make hash for upper and lower size letter so take size 256 that covers all char
        int[] hashArray = new int[256];


        //hashing =>preprossing
        for(int i=0 ; i<s1.length(); i++){
            hashArray[s1.charAt(i)]++; //stro using index =>index is asci value of char

        }

         System.out.println("char is : "+word + " count :"+hashArray[word]);





    }
}
