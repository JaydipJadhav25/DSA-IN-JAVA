import java.util.Scanner;

public class Pattern3{
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        // for(int i =1 ; i<= n ; i++){
        //      for(int j = n ; j >=i ; j-- ){
        //         System.out.print(" * ");
        //      }
        //      System.out.println();
        // }

        //case 2:
        for(int i =1 ; i<= n ; i++){
             for(int j = 1 ; j<=(n-i+1); j++ ){
                System.out.print(" * ");
             }
             System.out.println();
        }

    }
}