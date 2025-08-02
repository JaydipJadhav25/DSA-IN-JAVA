public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Power of Two:");
        int  n = 4;
        int  j = 1;
        //appreoch 1 => TC = o(n);
        boolean isPower = false;
         for(int  i =1; i<=n;i++){
            System.out.println("loop1 : "+i);

            if(n == j){
                // System.out.println(j);
                isPower = true;
                break;
            }
            j+=j;
            
         }
         if(isPower) System.out.println(true);
         else System.out.println(false);

           //appreoch 2 => TC = o(1);
           for(int i=0; i<=30 ; i++){
            System.out.println("loop2 : "+i);
            int ans = (int)(Math.pow(2, i));
            if(n == ans){
             isPower = true;
             break;
            }
           }
         if(isPower) System.out.println(true);
         else System.out.println(false);

    }
}
