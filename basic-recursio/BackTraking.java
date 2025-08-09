public class BackTraking {
    public static void print(int i , int n){
        if(i<1){
            return;
        }
        print(i-1, n);
        System.out.println(i);
    }



     public static void print2(int i , int n){
        if(i>n){
            return;
        }
        print2(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n =3;
        //1 to n
        print(n, n);
 System.out.println();
        //n to 1
        print2(1, n);

    }
}
