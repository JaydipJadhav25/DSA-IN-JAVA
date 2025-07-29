public class Pailodrom {
    public static void main(String[] args) {
        System.out.println("Palindrom");
        int n = 121;
        int num = n;
         int reversNumber =0;
        while ( n != 0) {
        int lastNumber = n%10;
        reversNumber = (reversNumber*10)+lastNumber;
        n /= 10;   
        }

        if (reversNumber == num && num>=0) {
            System.out.println("Number is palindrom");
        } else {
            System.out.println("Number is not palindrom");
            
        }
    }
}
