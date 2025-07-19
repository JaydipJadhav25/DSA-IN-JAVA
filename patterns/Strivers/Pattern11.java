public class Pattern11{
  public static void main(String[] args) {
     int start = 1;
    //  int start = 0;
     for(int i =0 ; i<5 ; i++){
        if(i %2==0) start=1;
        else start=0;
        for(int j=0; j<=i ; j++){
            System.out.print(start);
            //case1.
            // if(start == 1) start=0 ;
            // else start=1;

            //case2.
            start = 1-start; // 1-1=0 ; 1-0 = 1

        }
        System.out.println();
     }
  }
}