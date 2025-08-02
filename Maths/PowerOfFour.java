public class PowerOfFour {
    public static boolean checkPowerOfFour(int n ){

        if(n ==1){
            return true;
        }

        if(n <=0){
            return false;
        }
        while (n%4==0) {
            System.out.println(",,,,");
            n /=4;
        }

        return n ==1;
    }
    public static void main(String[] args) {
        int n=0;
 
        System.out.println(checkPowerOfFour(n));
       
    }
}
