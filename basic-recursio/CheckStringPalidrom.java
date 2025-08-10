public class CheckStringPalidrom {

    public static boolean print(int i ,String s , int n ){

        System.out.println("string is : "+s);

        if(i >= n/2) return true;

        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }

        return print(i+1, s, n);
    }

    public static boolean print2(int l , String s , int r ){
        if(l >= r) return true;

        if(s.charAt(l) != s.charAt(r)){
            return false;
        }

        return print2(l+1, s, r-1);
    }





    public static void main(String[] args) {
        String s  = "maadaam";
           String s2 = "A man, a plan, a canal: Panama";
           String s3 = "a.";
        //  String result = s2.replaceAll("[ , : ]", "").toUpperCase(); // removes spaces and commas
        //  String result = s3.replaceAll("[ , : . ]", "").toUpperCase(); // removes spaces and commas
         String result = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
         System.out.println(result);
        // System.out.println(s);
        //single pointer
       System.out.println("Strig is palidrom 1: "+ print(0, result, result.length()));
        //two pointer
       // System.out.println("Strig is palidrom 2: "+ print2(0, s, (s.length())-1));


    
    }
}
