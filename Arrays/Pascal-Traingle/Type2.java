// package Pascal-Traingle;

public class Type2 {
    //   public static int findeElement(int n ,int  r){

    //     int ans =1 ;
    //     for(int i =0 ; i<r; i++){

    //         ans = ans*(n-i);
    //         ans = ans/(i+1);
                 
    //     }

    //     return ans;
        
    // }

    public static void printRow(int n){
        int ans = 1;
        System.out.print(ans); // print 1 always 1
        //use zero based indexing
        //loop start from 1
        for (int i = 1; i <n; i++) {
            ans = ans*(n-i);
            ans = ans/i;
            System.out.print(" "+ans+" ");
        }
        // System.out.print(1);


    }
    public static void main(String[] args) {
        int n = 6 ;
        //1.tc = o(n)3
        // for (int c = 1; c<=n; c++) {
        //     System.out.print( findeElement(n-1, c-1)+" ");
        // }

        //2
        //use formula ans = (row - col)/col;
        printRow(6);

        return;

    }
}
