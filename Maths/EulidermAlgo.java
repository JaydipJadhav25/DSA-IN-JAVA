public class EulidermAlgo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 =20;
        while(num1>0 && num2 >0){
            // System.out.println("run..");
            if(num1 >num2){
                num1 = num1%num2;
            }else{
                num2 = num2%num1;
            }
        }
        if(num1 ==0){
            System.out.println("gcd is : "+num2);
        }else
            System.out.println("gcd is : "+num1);



    }
}
