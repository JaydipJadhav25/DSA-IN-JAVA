import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapChar {
    public static void main(String[] args) {
      Map<Character, Integer> mapChar = new HashMap<>(); // Change String to Character
        String s = "jaydipjadhav";

        // Pre-compute
        for (int i = 0; i < s.length(); i++) {
            mapChar.merge(s.charAt(i), 1, Integer::sum);
        }
        
        System.out.println(mapChar);

         Scanner sc = new Scanner(System.in);
         char letter = sc.next().charAt(0);

         System.out.println("this letter "+ letter+" count is :"+ mapChar.get(letter));

    }
}
