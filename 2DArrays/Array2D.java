import java.util.Scanner;

public class Array2D {
     public static void searchIn2DArray(int[][] arrr , int target){
       //for and search
       //row
       for (int i = 0; i < arrr.length; i++) {
         for (int j = 0; j < arrr[0].length; j++) {
            //check
            if (arrr[i][j] == target) {
                //print index
                System.out.println("index is : "+ i + " and "+ j);
                break;
            }
         }
       }

       System.out.println("element Is not persent in array :");
     }

    public static void main(String[] args) {
        int[][] marks = new int[2][2];
        
        //take input from user
        //rows
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < marks.length; i++) {
            //columns
            for (int j = 0; j < marks[0].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("done now printing array : ");

          for (int i = 0; i < marks.length; i++) {
            //columns
            for (int j = 0; j < marks[0].length; j++) {
                // marks[i][j] = sc.nextInt();
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }


        int target = sc.nextInt();
        searchIn2DArray(marks, target);

        
    }

    
}
