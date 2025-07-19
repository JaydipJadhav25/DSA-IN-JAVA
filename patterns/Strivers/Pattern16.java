public class Pattern16 {
    public static void main(String[] args) {
        for(char ch = 'A'; ch<'A'+5; ch++){
            for(char c = 'A'; c<=ch; c++){
                 System.out.print(ch);
            }
            System.out.println();
        }
    }
}
