import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i = 1; i<=(2*n)-1 ; i++){
            int star = i;
            //break- sysmetry
                     
            // if(i== n) { //this is my mistek i set only for at n hit but after agin star update it real value i
             //os i want to update a each time
            // System.out.println("run ");
            //     star = 2*n-i;
            //     System.out.println(star);
            // }

            if(i>n) star = 2*n-i ;//update for each time for hit sysmetry
            
             for(int j = 1 ; j<=star ; j++){
                System.out.print("*");
             }
             System.out.println();
        }
    }
}
