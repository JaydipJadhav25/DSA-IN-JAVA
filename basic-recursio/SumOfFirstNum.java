public class SumOfFirstNum {

    public static void print(int i , int sum){
        if(i<1){
            System.out.println("sum : "+sum);
            return;
        }
        print(i-1, sum+i);
    }


    public static int print(int n){
        if(n ==0){
            return 0;
        }

        return n + print(n-1);
    }

     public static int fact(int n){
        if(n ==1){
            return 1;
        }

        return n * fact(n-1);
    }




    public static void main(String[] args) {
        int n =4;
        System.out.println("Parametrised function");
        print(n , 0);
        System.out.println("functional");
        System.out.println("sum is :"+print(n));

        System.out.println("factorial : "+fact(n));




    }
}
