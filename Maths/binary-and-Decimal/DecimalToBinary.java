public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("decimal to binary");
        int n =-5;
        int m = n;
        int binary = 0;
        // int pow = 0;
        int pow = 1;
         while (n !=0) {
            int rem = n % 2;
            // binary = binary+(rem* (int)Math.pow(10 , pow));
            binary = binary+(rem* pow);
            // pow++;
            pow *=10;
            n = n/2;
         }
         System.out.println("Binary number : "+binary);

         System.out.println("Approch 2.");
         
         int ans = 0;
         int power = 1;
         while (m !=0) {
            int bit = m &1;
            ans = ans +(bit * power);
            m = m>>1;
            power *=10;
         }
         System.out.println("Decimal to Binary :"+ans);



     
    }
}
