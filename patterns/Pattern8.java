// package patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n=8;
        for(int i=1; i<=n ; i++){
            //space
            for(int j =1; j<=n-i ; j++){
                System.out.print(" ");
            }
            //star
            for(int s = 1; s<=n ; s++){
                if(i == 1 || i ==n || s ==1|| s==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
