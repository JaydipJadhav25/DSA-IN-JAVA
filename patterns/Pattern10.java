public class Pattern10 {
    public static void main(String[] args) {
        int n =4;
        int exspace =n-1;
        int innerspace = 0;
        for(int i =1; i<=2*n-1 ;i++){
            //spaace
            for(int s=1 ; s<=exspace;s++){
                System.out.print(" ");
            }
            //star
            System.out.print("*");

            //space=>inner
            for(int j=1;j<innerspace;j++){
                System.out.print(" ");
            }
            //star
            if(i==1 || i == 2*n-1 ){

            }else{
                System.out.print("*");
            }

            //condtion
            if(i>=n){
                
                exspace +=1;
                innerspace -=2;

            }else{
                innerspace +=2;
                exspace -=1;

            }
            System.out.println();

        }
    }
}
