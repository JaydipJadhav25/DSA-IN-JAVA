public class CheckStringPalidrom {

    public static boolean print(int i ,String s , int n ){
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
        // System.out.println(s);
        //single pointer
        System.out.println("Strig is palidrom 1: "+ print(0, s, s.length()));
        //two pointer
        System.out.println("Strig is palidrom 2: "+ print2(0, s, (s.length())-1));


    }
}
