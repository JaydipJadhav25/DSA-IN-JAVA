public class PrimeFactorsOfNumber {
    public static void main(String[] args) {
        int n =16;//
        // int[] arr = new int[];
        // int counter = 0;
        // prime number starts from 2
        // for(int i =2 ; i<=n ; i++){
        //     //check all divisor /factors
        // int counter = 0;
        //     if(n%i==0){
        //         // System.out.println("factors : "+i);
        //         //case.1
        //         //check prime for each i //2 ,3 4 5 
        //         // for(int j=1 ; j<=i; j++){
        //         //     // System.out.println(" j"+j);
        //         //   if(i%j==0){
        //         //    counter++;
        //         //   }
        //         // }
        //         //add


        //         //case.2
        //         // check prime
        //         // for(int j=1; j*j<=i;j++){
        //         //     // System.out.println("j : "+j);
        //         //     if(i%j==0){
        //         //      counter++;
        //         //      //check 
        //         //      if((i/j) != j){
        //         //         counter++;
        //         //      }
                     
        //         //     }
        //         //     if(counter>2) break;
        //         // }

        //         // if(counter ==2){
        //         //     System.out.println(i+" ");
        //         // }
        //     }
        // }



        // optimal way to solve this 
        //prime number always start frim 2
        
        for(int i =2; i<=Math.sqrt(n) ; i++){
           if(n%i ==0){
            System.out.print(i+" ");
            //reduce valuse
            while (n%i ==0) {
                 n = n/i;
            }
            //for itself divisor
        }
    }
    if(n != 1) System.out.print(n+" ");
    }
}
