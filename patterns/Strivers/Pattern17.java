public class Pattern17{
    public static void main(String[] args) {
        for(int i =0 ; i<5 ; i++){
             //space
             for(int j= 1; j<=(5-i-1) ; j++){
                System.out.print(" ");
             }
              char ch ='A';
              int breakpoint = (2*i+1)/2;   
             //char
             for(int s = 1; s<=2*i+1;s++){
                System.out.print(ch);
                // ch++;
                if(s<=breakpoint) ch++;
                else ch--;
             }

             //space
             for(int j= 1; j<=(5-i-1) ; j++){
                System.out.print(" ");
             }
             System.out.println();
        }
    }
}