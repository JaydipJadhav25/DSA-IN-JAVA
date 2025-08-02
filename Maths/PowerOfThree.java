public class PowerOfThree {
    public static void main(String[] args) {
        //  int result = 1;
        // int power = 0;

        // while (result > 0 && result <= Integer.MAX_VALUE / 3) {
        //     System.out.println("3^" + power + " = " + result);
        //     result *= 3;
        //     power++;
        // }

        // // Print last valid one
        // System.out.println("3^" + power + " = " + result + " ✅ LAST IN RANGE");



        int result = 1;
        int n= 3;
        while (result <= n && result > 0) {
            if (n == result) {
              System.out.println(false);

            }
            // Check before next multiplication to prevent overflow
            if (result > Integer.MAX_VALUE / 3) break;
            result *= 3;
        }

        System.out.println(false);

        //3.
   if (n <= 0)    System.out.println( false);;

        while (n % 3 == 0) {
            n /= 3;
        }

        System.out.println( n== 1);


    }
}
