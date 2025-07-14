public class Main {
    public static void main(String[] args) {
        System.out.println("..............Operators..............");
        int a =10;
        int b = 20;
        System.out.println("1.Arithmetic opratores");
        System.out.println("A+B "+(a+b));
        System.out.println("A-B "+(a-b));
        System.out.println("A*B "+(a*b));
        System.out.println("A/B "+(a/b));
        System.out.println("A++ "+(a++));
        System.out.println("++A "+(++a));
        System.out.println("A-- "+(a--));
        System.out.println("--A "+(--a));


        System.out.println("2.Realational opratores");
        System.out.println("< " +(a<b));
        System.out.println("> "+(a>b));
        System.out.println(">= "+(a>=b));
        System.out.println("<= "+(a<=b));
      
        System.out.println("3.Logical opratores");
        System.out.println(" && "+( a >0 && 0< b ));
        System.out.println(" || "+(a >0|| 0< b ));

        System.out.println("4.assignment opratores");
        System.out.println("+="+(a+=1));
        System.out.println("-="+(a-=1));
        System.out.println("*="+(a*=1));
        System.out.println("/="+(a/=1));

        System.out.println("5.Bitwise opratores");
        System.out.println("a&b "+(a&b));
        System.out.println("a||b "+(a|b));
        System.out.println("~a "+(~a));
        System.out.println("5<<2 "+(5<<2));
        System.out.println("5>>2 "+(5>>2));


      

        
    }
}
