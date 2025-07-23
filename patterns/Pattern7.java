 package patterns;

public class Pattern7 {
     public static void main(String[] args) {
      int n=8;
      for(int i=1 ; i<=n;i++){
         //space
         for(int s=1; s<=n-i ;s++){
            System.out.print(" ");
         }
         //star
         for(int t=1;t<=n; t++){
            System.out.print("*");
         }
          //space
         for(int s=1; s<=i-1 ;s++){
            System.out.print(" ");
         }
          //space
         for(int s=1; s<=n-i ;s++){
            System.out.print(" ");
         }
          //star
         for(int t=1;t<=n; t++){
            System.out.print("*");
         }
        
         System.out.println();
      }
     }
}
