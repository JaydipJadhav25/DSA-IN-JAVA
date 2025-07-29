public class DigitCount{
    public static void main(String[] args) {
        System.out.println("digit count");
        int n = 123;
        int counter =0;
        while ( n != 0) {
        //  int lastNumber = n%10;
        counter +=1;
        n /= 10;   
       
        }
        System.out.println("number is"+n+" digit is : "+counter);
    }
}