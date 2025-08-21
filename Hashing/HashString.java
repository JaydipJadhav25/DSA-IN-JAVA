public class HashString {
    public static void main(String[] args) {
   

        // this is brute focers TC=O(n*n)
     String s1 = "HelloWorld";
        char target = 'l';   // use single quotes for char
        int counter = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == target) {
                counter++;
            }
        }

        System.out.println("char count is : " + counter);

    }
}
