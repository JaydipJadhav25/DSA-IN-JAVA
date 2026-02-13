import java.nio.channels.Pipe.SourceChannel;

public class Strings{
       public static void main(String[] x) {
            
        String str1 = "jaydip";
        String str2 = new String("jadhav");

        //conceneta
        String result = str1 + " " + str2;
        System.out.println(result);

        //charAt
        System.out.println(str1.charAt(0));


        //print all letter in strings
        //loop on letters
        for (int i = 0; i < result.length(); i++) {
            System.out.println(result.charAt(i));
        }


       }
}