public class PowerOfNumber {
    public static void main(String[] args) {
       int n =10;
       int x =1; 
       long m =n;
       double ans = 1.0;
       if(n<0){
        n = -n;
       }
       //for n is zero
       if(n == 0){
        System.out.println(1);
       }
       //for a to n
       for(int i = 1 ; i<=n; i++){
        ans = ans*x;
       }

       //for nigative
       if(m<0){
        System.out.println(1/ans);
       }else
       System.out.println(ans);
    }
}
