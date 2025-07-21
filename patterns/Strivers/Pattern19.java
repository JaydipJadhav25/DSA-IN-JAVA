public class Pattern19 {
    public static void main(String[] args) {
        int space = 0;
        for(int i=0;i<5;i++){
            //star
            for(int j=1; j<=5-i;j++){
                System.out.print("*");
            }
            //space
            for(int s=0; s<space ;s++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=5-i;j++){
                System.out.print("*");
            }
            System.out.println();
            space +=2;
        }
         int second = space-2;
        for(int i=1;i<=5;i++){
            //star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int s=0; s<second;s++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            second -=2;
        }
    }
}
