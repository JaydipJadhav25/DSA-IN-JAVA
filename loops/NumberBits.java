public class NumberBits {
    public static void main(String[] args) {
        System.out.println("191. Number of 1 Bits\r\n Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).\r\n" );

        // int a =00000000001100;
        // int a =12;
        int a =4;
        int count = 0;
            //  a = a>>1;

         while (a != 0) {
            //a in int but  ,  i used & this check bit  , this check currect bit is 1 or not
            if( (a&1) ==1){
                count++;
            }
            // System.out.println(a);
            System.out.println(Integer.toBinaryString(a));
            a = a>>1;
         }

         System.out.println("count of 1 bits : "+ count);
        //  System.out.println(1&1);




    }
}
