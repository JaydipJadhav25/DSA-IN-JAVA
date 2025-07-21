public class Pattern20 {
    public static void main(String[] args) {
        int n=5;
        // 
        int breakpoint = 0;
        // int breakpointspace = 0;
        int breakpointspace = 2*n-2;//8
    
        for(int i =1;i<=2*n-1;i++){
            // System.out.println(breakpointspace);
            // breakpointspace = 2*n-2*i;
            //breakpoint
            breakpoint = i;
            if(i>n) {
                breakpoint = 2*n-i;
            };
            //star
            for(int j=1; j<=breakpoint;j++){
                System.out.print("*");
            }
            //space
            for(int s=1;s<=breakpointspace; s++){
                System.out.print(" ");
            }
             //star
            // if(i>n) breakpoint = 2*n-i;
            for(int j=1; j<=breakpoint;j++){
                System.out.print("*");
            }
            System.out.println();
            // breakpointspace +=2;
            //for space
            if(i<n) breakpointspace -=2;
            else breakpointspace +=2;

        }
    }
}
