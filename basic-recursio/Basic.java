

public class Basic {
        static int counter =0;
       public static void print(){
              if(counter == 4){
                return;
              }
              System.out.println(counter);
              counter++;
              print();
        }

        public static void print1( int i ,int n){
           
             //base condition
             if(i>n){
                return;
             }
            System.out.println("jaydip");
            // i++;
            print1(i+1,n);

        }


        //print 1 to n
        public static void print2(int i , int n){
            if(i>n) return ;
            System.out.println(i);
            print2(++i, n);
        }



        // public static void print3(int n){
        //     if(n<0){
        //         return;
        //     }
        //     System.out.println(n);
        //     n -=1;
        //     print3(n);
        // }

         public static void print3(int i , int n){
            if(i<1){
                return;
            }
            System.out.println(i);
            
            print3(i-1 , n);
        }
    public static void main(String[] args) {
        // print();

        //print name n times
        // int n =5;
        // int i =1;
        // print1( i , n);


        //print to 1 to n
        int n =4;
        // print2(1 , n);

    //print n to 1
    //print3(n);
       print3(n , n);



    }
}
