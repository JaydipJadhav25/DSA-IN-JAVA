public class BinayToDecimal{
    public static void main(String[] args) {
        System.out.println("binary to decimal!");
        int n = 1001;
        int m =n;
        int decimal = 0;
        int power = 1;

        // while (n !=0) {
        //     int digit = n % 10 ;
        //     System.out.print(digit +" ");
        //     // System.out.print(n+" ");
        //     n = n/10;
            
        // }



        while (n !=0) {
         int lastDigit = n % 10;
         System.out.println("last digit : "+lastDigit);
         decimal = decimal+(lastDigit*power);
         n /=10;
         power +=power;   
        }
        System.out.println("Decimal NUmber : "+decimal);




        System.out.println("Approch 2");
        int ans =0;
         int pow = 1;
        while (m !=0) {
            int digit = m%10;
           //check only for 1
           if(digit == 1){
             ans = ans +(digit *pow);
           }
           pow +=pow;
           m /=10;
        }
        System.out.println("Decimal NUmber :"+ ans);


    }
}