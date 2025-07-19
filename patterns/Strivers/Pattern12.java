public class Pattern12 {
    public static void main(String[] args) {
        
        for(int i =1 ; i<=4; i++){
            //numbers
            for(int j = 1; j<=i; j++){
               System.out.print(j);
            }
            //space
            for(int s= 1; s<5-i;s++){
                System.out.print(" ");
            }
             //space
            for(int s= 1; s<5-i;s++){
                System.out.print(" ");
            }
              //numbers
            for(int j =i ; j>=1; j--){
               System.out.print(j);
            }
            System.out.println();
        }



        //revers
           for(int i =4 ; i>=1; i--){
            //numbers
            for(int j = 1; j<=i; j++){
               System.out.print(j);
            }
            //space
            for(int s =1 ; s<=(2*4)-2*i ; s++){
                System.out.print(" ");
            }

              //numbers
            for(int j =i ; j>=1; j--){
               System.out.print(j);
            }
            System.out.println();
        }

System.out.println();
      ///second approch
        
     // int start = 2* (4 -1); //6
      int start = 2*4 -2; //6
        for(int i =1; i<=4; i++){
            //numbers
            for(int j = 1; j<=i; j++){
               System.out.print(j);
            }
            //space
            // for(int s =1 ; s<=(2*4)-2*i; s++){
            //     System.out.print(" ");
            // }
            for(int s =1 ; s<=start; s++){
                System.out.print(" ");
            }

              //numbers
            for(int j =i ; j>=1; j--){
               System.out.print(j);
            }
            System.out.println();
            start -=2;//4 //2//0
        }
        
    }
}
