public class SumOfNumber {
    public static void main(String[] args) {
        int num= 234;
        int last = 0;
        int sum = 0;
        int product = 1;
        while (num > 0) {
          last = num%10;
          System.out.println(last);
          sum += last;
          product *= last;
          num = num /10;
        }
        System.out.println("sum is :"+sum);
        System.out.println("product is : "+product);

    }
    
}
