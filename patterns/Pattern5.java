public class Pattern5{
    public static void main(String[] args) {
        int breakpoint = 0;
        for(int i =1; i<=(2*5)-1 ; i++){
            breakpoint = i;
            //break if reach n
            if(i>5) breakpoint = 2*5-i;
            for(int j =1 ; j<=breakpoint ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}