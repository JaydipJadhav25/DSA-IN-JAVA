public class Pattern9{
    public static void main(String[] args) {
          int n=3;
          for(int i=1; i<=n; i++) {
               char start = (char)('A'+n-1);  
               for(int j=1; j<=i;j++){
                 System.out.print(start+" ");
                 start--;
               }
            System.out.println();
        }

        //2.
       char end = (char)('A' + n - 1);  // chh = 'E'

        for (int i = 0; i < n; i++) {
            char start = (char)(end - i);  // Explicit cast required

            for (char ch = start; ch <= end; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        


        //3.
        System.out.println();


// * * * * * * 
// * *     * * 
// *         * 
// *         * 
// * *     * * 
// * * * * * *
// * * * * * * 
// * *     * * 
// *         * 
// *         * 
// * *     * * 
// * * * * * * 
           //top
        int space =0;
        for(int i=0; i<n; i++){
             //star
             for(int j=1; j<=n-i;j++){
                System.out.print("* ");
             }
             //space
             for(int s=1; s<=space ; s++){
                System.out.print(" ");
             }
             //star
             for(int j=1; j<=n-i;j++){
                System.out.print("* ");
             }
             System.out.println();
             space +=4;

        }


// *         * 
// * *     * * 
// * * * * * *
        // bottom
        int space2 =space-4;
         for(int i=1; i<=n; i++){
             //star
             for(int j=1; j<=i;j++){
                System.out.print("* ");
             }
             //space
             for(int s=1; s<=space2 ; s++){
                System.out.print(" ");
             }
             //star
             for(int j=1; j<=i;j++){
                System.out.print("* ");
             }
             System.out.println();
             space2 -=4;

        }


    System.out.println();
    System.out.println();
// *         * //8
// * *     * *//4
// * * * * * *//0
// * *     * *//4
// *         *//8
    int space3 = n*2+2;
    int star = 1;
    // int space4 = space+4;

    for(int i=1 ; i<=2*n-1;i++){
        //star
        star =i;
        if(i>n) star =2*n-i;
        
        for(int j=1; j<=star;j++){
            System.out.print("*-");
        }
        //space
        for(int s=0;s<space3;s++){
            System.out.print("-");
        }
        //star
        for(int j=1; j<=star;j++){
            System.out.print("*-");
        }
        System.out.println();
       if(i<n) { 
            space3 -=4;
        }else{
            space3 +=4;
        }
    }


    }
}