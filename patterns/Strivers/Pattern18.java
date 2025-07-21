public class Pattern18{
    public static void main(String[] args) {
          char end = (char)('A' + 5 - 1);  // chh = 'E'

        for (int i = 0; i < 5; i++) {
            char start = (char)(end - i);  // Explicit cast required

            for (char ch = start; ch <= end; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}