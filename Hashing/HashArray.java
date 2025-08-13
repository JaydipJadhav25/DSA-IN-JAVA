import java.util.Scanner;

public class HashArray {
  
    public static void main(String[] args) {
        // System.out.println("1. brut forces attaks ...");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
         
         System.out.println("give a number do want to check how many time is present array:");
        int q = sc.nextInt();
        // // while (q !=0) {
        //    int num = sc.nextInt();
        //    int counter = 0;
        //    for(int i=0 ; i<n;i++){
        //       if(n == arr[i]){
        //         counter++;
        //       }
        //    } 
        //    System.out.println("Number "+num+" Is Present :"+counter);


           System.out.println("2. Using hashing");
           int[] hash = new int[13]; // automatically filled with 0
          
           //prestoring
           for(int i=0 ; i<n ; i++){
             hash[arr[i]] +=1;//ech element for one index create and stor count and update also old count/ vlaue
             System.out.println(hash[arr[i]]);
           }

            for(int i=0 ; i<13 ; i++){
              System.out.print(hash[i]+" ");
           }

           

           System.out.println("Number : "+q+"Present "+hash[q]);

           
           
          

        
    }
    
}