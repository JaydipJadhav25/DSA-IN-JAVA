public class Pattern8 {
    public static void main(String[] args) {
        
       //1/////////////////////////////////////////////////
        //first part
        for(int i = 1 ; i <=4 ; i++){
            //space 
            for(int j = 1; j<=4-i; j++){
                System.out.print(" ");
            }
            //star
            for(int s = 1; s<=2*i-1 ; s++){
                System.out.print("*");
            }
            //space 
            for(int j = 1; j<=4-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //seconde part
        for(int i = 1 ; i<=4 ; i++){
             //space
             for(int j = 1; j<=i-1 ; j++){
                System.out.print(" ");
             }
             //star
             for(int s=1 ; s<=(2*4)-(2*i-1); s++){
                System.out.print("*");
             }
             //space
             for(int j = 1; j<=i-1 ; j++){
                System.out.print(" ");
             }
            System.out.println();

        }

       //2/////////////////////////////////////////////////
         //first part
        for(int i = 1 ; i <=4 ; i++){
            //space 
            for(int j = 1; j<=4-i; j++){
                System.out.print("*");
            }
            //star
            for(int s = 1; s<=2*i-1 ; s++){
                System.out.print(" ");
            }
            //space 
            for(int j = 1; j<=4-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //seconde part
        for(int i = 1 ; i<=4 ; i++){
             //space
             for(int j = 1; j<=i-1 ; j++){
                System.out.print("*");
             }
             //star
             for(int s=1 ; s<=(2*4)-(2*i-1); s++){
                System.out.print(" ");
             }
             //space
             for(int j = 1; j<=i-1 ; j++){
                System.out.print("*");
             }
            System.out.println();

        }
    }
}
