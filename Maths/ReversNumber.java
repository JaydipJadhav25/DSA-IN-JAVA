public class ReversNumber {
    public static void main(String[] args) {
        System.out.println("Revers number !");
        int n =123;
        int ans =0;

        while (n !=0) {
          int last = n %10;
          //check int rang condition
         // Check for overflow before multiplying and adding
    if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && last > 7)) {
             System.out.println("revers numbet is : "+ans); // overflow
    }
    if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && last < -8)) {
            System.out.println("revers numbet is : "+ans); // underflow
    }
          ans = (ans*10)+last;
          n = n/10;
        }
        System.out.println("revers numbet is : "+ans);
    }
}
