public class Optimal {
    public static void main(String[] args) {

        int[] arr = new int[]{4,3,6,2,1,1};
        int n = arr.length;

         long sn = (n*(n+1))/2;
         long s2n = (n*(n+1)*(2*n+1))/6;
         int s=0 ; int s2 = 0;
         for (int i = 0; i < arr.length; i++) {
            //sum of all give numbers
            s += arr[i];
            s2 += arr[i]*arr[i];
         }

         //now 
         long val1 = (long)s - sn; // eq 1 => x - y 
         long val2 = (long)s2- s2n; //  x^2 - y^2 
         //now (x-y) (x+y) = val2; so (x-y) => eq1 and 
         //so (x+y) = val2/val1;
         val2 = val2/val1; // eq 2 =>x+y 
         //now solc equcation
         long X = (val1 + val2)/2;
         long Y = X - val1;

         System.out.println("reapting value : "+ X + " messing value : "+ Y);
         
        


    }
    
}
