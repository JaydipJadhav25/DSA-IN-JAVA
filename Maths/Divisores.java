public class Divisores {
    public static void main(String[] args) {
        int n = 10 ; //1 , 2 , 5 , 10

        // for(int i =1; i<=n ;i++){
        //     if(n%i ==0){
        //         System.out.print(i+" ");
        //     }
        // }
        //case 2 ;
        for(int i=1 ; i*i<=n;i++){
            //check
            if(n%i==0){
                System.out.print(i+" ");
                //check condistion
                if((n/i) !=i){
                   System.out.print(n/i+" ");                                     
                }
            }
        }
    }
}
