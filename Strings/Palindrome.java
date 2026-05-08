public class Palindrome {
    public static void main(String[] args) {
        // String str = "nooon";
        String str = "jaydip";
      

        int n = str.length();
        //approch - 1;
        boolean isPalindrom = true;
        for (int i = 0; i < str.length()/2; i++) {
            //check
            if (str.charAt(i) != str.charAt(n-1-i)) {
                isPalindrom = false;
                break;
            }
        }
        //result
        // if (isPalindrom) {
        //     System.out.println("yes");
        // }else{
        //     System.out.println("No");
        // }

        //approch 2

        int start = 0;
        int end = n-1;
        while (start < end) {
            //check
            if (str.charAt(start) == str.charAt(end)) {
                //update
                start++;
                end--;
            }else{
              
                isPalindrom = false;
                break;

            }
        }


           if (isPalindrom) {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }


    }
}
