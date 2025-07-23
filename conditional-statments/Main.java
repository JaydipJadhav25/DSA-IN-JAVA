public class Main{
    public static void main(String[] args) {
      int a = 10 , b =20;
      if(++a){ //in cpp this do not throw any error because cpp is more flexiable but 
                //in java it is throwing type error , condintion give only true of false , not accpet any other vlause or data type
        System.out.println(++a);
      }else
       System.out.println(b);
      
      
    }
}