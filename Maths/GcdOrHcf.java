public class GcdOrHcf {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 =20;
        int divisor = 0;
        //case =1 
        for(int i=1;i<=Math.min(num1, num2) ; i++){
              System.out.println("run..1");
            
            //check comman divisor
            if(num1%i ==0 && num2%i==0){
                divisor = i;
            }
        }
        System.out.println("gcd : "+divisor);

        //case2 loop travers from n to 1
        for(int i =Math.min(num1, num2); i>=1 ; i-- ){
              //check comman divisor
              System.out.println("run..2");
            if(num1%i ==0 && num2%i==0){
                divisor = i;
                System.out.println("gcd : "+divisor);
                break;
            }
        }
        // tc = o(n);

        //case 3 optimize
        
    }
}
