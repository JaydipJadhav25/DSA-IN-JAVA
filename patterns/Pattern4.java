public class Pattern4{
    public static void main(String[] args) {
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********


        for(int i = 1; i<=5; i++){

            //for 1 part:star and space
            //star
             for(int j = 1 ; j<=i; j++){
                System.out.print("*");
             }
             //space
             for(int s = 1; s<=5-i ; s++){
                  System.out.print(" ");
             }
            //  System.out.println();
            //for 2 part:space and star
            //space
             for(int s = 1; s<=5-i ; s++){
                  System.out.print(" ");
             }
             //star
             for(int j = 1 ; j<=i; j++){
                System.out.print("*");
             }
            
            //  //adition
            //  //star
            //  for(int j = 1 ; j<=i; j++){
            //     System.out.print("*");
            //  }
            //   //space
            //  for(int s = 1; s<=5-i ; s++){
            //       System.out.print(" ");
            //  }
            //   //space
            //  for(int s = 1; s<=5-i ; s++){
            //       System.out.print(" ");
            //  }
            //    //star
            //  for(int j = 1 ; j<=i; j++){
            //     System.out.print("*");
            //  }
             System.out.println();
             
             
             
            }
            ///////////////////////////////////////////////////////////2/////////////////////////////////////////////
            ///            
            System.out.println();
            System.out.println("___@2______");
            System.out.println();
           boolean mid = true;

           //1.
           for(int i = 1 ; i<=5; i++){
             //for 1 part:star and space
            //star
             for(int j = 1 ; j<=i; j++){
                System.out.print("*");
             }
             //space
             for(int s = 1; s<=5-i ; s++){
                  System.out.print(" ");
             }
             //space
             for(int s = 1; s<=5-i ; s++){
                  System.out.print(" ");
             }

              //star
             for(int j = 1 ; j<=i; j++){
                System.out.print("*");
             }

             System.out.println();
           }
           //bottm
            for(int i = 1 ; i<=5; i++){
             //for 1 part:star and space
            //star
             for(int j = 1 ; j<=5-i; j++){
                System.out.print("*");
             }
             //space
             for(int s = 1; s<=i ; s++){
                  System.out.print(" ");
             }
              //space
             for(int s = 1; s<=i ; s++){
                  System.out.print(" ");
             }
               //star
             for(int j = 1 ; j<=5-i; j++){
                System.out.print("*");
             }
             System.out.println();
           }

      



    }
}