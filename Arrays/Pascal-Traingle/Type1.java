// package Pascal-Traingle;

public class Type1 {
    public static int findeElement(int n ,int  r){

        int ans =1 ;
        for(int i =0 ; i<r; i++){

            ans = ans*(n-i);
            ans = ans/(i+1);
                 
        }

        return ans;
        
    }
    public static void main(String[] args) {
        System.out.println("based on row and column finde element in pascal traingle");
        // formula
        // ans= (row =>col)!/(col)!
        int row = 5 ;
        int col = 3;
        System.out.println("element is : "+ findeElement(row-1 , col-1));








    }
    
}
