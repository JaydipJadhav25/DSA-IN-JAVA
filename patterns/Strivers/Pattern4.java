import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            //space
            for(int j = 0 ; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int s= 0 ; s<(2*n)-(2*i+1);s++){
                 System.out.print("*");
            }
             //space their is no need to print spac
            for(int j = 0 ; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        //2.

         for(int i = 0 ; i<n ; i++){
            //space
            for(int j = 0 ; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int s= 0 ; s<(2*n)-(2*i+1);s++){
                 System.out.print(i);
            }
             //space their is no need to print spac
            for(int j = 0 ; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = n-1 ; i>=0 ; i--){
            //space
            for(int j = 0 ; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int s= 0 ; s<(2*n)-(2*i+1);s++){
                 System.out.print(i);
            }
             //space their is no need to print spac
            for(int j = 0 ; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
