public class FabonachiNumber {
    public static int print(int n){
        if(n<=1){
            return n;
        }

        int last = print(n-1);
        int slast = print(n-2);

        return last+slast;
    }
    public static void main(String[] args) {
        
        System.out.println(print(4));
        System.out.println(print(9));
    }
}
