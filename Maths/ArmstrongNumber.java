public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong Number");
// Input: n = 153
// Output: true

// Explanation: Number of digits : 3.

// 1*3 + 5*3 + 3*3 = 1 + 125 + 27 = 153.

// Therefore, it is an Armstrong number.

        int n =153;
        int num =n;
        int sum =0;
        while (n !=0) {
            int last =n%10;
            sum =sum+(last*last*last);
            n /=10;
        }
        if(sum ==num){
            System.out.println("Therefore, it is an Armstrong number");
        }else
        System.out.println("Therefore, it is Not an Armstrong number");
    }
}
