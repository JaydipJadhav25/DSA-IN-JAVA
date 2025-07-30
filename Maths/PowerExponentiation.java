public class PowerExponentiation {

   static double myPow(double x, int n) {
        double ans = 1.0;
        long m = n; // Use long to avoid overflow for edge cases like Integer.MIN_VALUE

        if (m < 0) {
            x = 1 / x;
            m = -m;
        }

        while (m > 0) {
            if (m % 2 == 1) {
                ans *= x;
                m--;
            } else {
                x *= x;
                m /= 2;
            }
        }

        return ans;
    }

    static void power(double x, int n){
        System.out.println("POWer function");
        long m =n;
        double ans=1;
       
        //convert nigative to positive
        if(n<0){
            n = -n;
        }
        while (n>0) {
            //check even 
            if(n%2==1){
                ans = ans*x;
                n--;
            }else{
                n = n/2;
                x = x*x;
            }
        }
        if(m<0){
            System.out.printf("%.4f" , (1/ans));
        }else{
            System.out.printf("%.4f" , ans);
        }

        
    }
    public static void main(String[] args) {
        System.out.println("Power Exponentiation ");
        // int a= 2;
        // int n =5;
        // int ans = 1;
       //case1
        // for(int i =1 ; i<=n ; i++){
        // //  ans  *=a;
        // ans = ans *a;
        // }
        // System.out.println(ans);

        //case2 
        double x  =  2.0000;
        int n = 10;
        // int n = -2;
        double  m = n;//stor
        double ans = 1.0;
       //convet
       if(n <0){
        n = (n*-1);
       }
        while(n > 0){
            //check odd
            if(n%2 == 1){
                ans = ans*x;
                // if(n<0){
                //     //convert positive
                //  n =(n*-1)-1;
                //  System.out.println("inside :"+n);
                // }else{
                // n = n-1;
                // }
                n = n-1;
            }else{
                x=x*x;
                n =n/2;
            }
        }
        //check nigative
        // System.out.println("m :"+m);
        if(m < 0){
        System.out.println("ans "+(1/ans));
        }else{
        System.out.println("ans "+(ans));
        }
        // System.out.println("ans : "+ans);



        //create function
        // The %.4f means: print 4 digits after the decimal.
    System.out.printf("%.4f\n", myPow(2.0000, 10));  // 1024.0000
    System.out.printf("%.4f\n", myPow(2.0000, -2));  // 0.2500

        // System.out.println( myPow(2.0000, 10));  // 1024.0
        // System.out.println(myPow(2.0000, -2));  // 0.25
/////////////////////////////////////////////////////////////////////


power(2.0000, 10);
power(2.0000, -2);

 
// String name = "Alice";
// int age = 30;
// double salary = 50000.75;

// System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);
    }
}
