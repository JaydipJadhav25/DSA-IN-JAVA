public class ReversNumber {
  public static void main(String[] args) {
      System.out.println("Revers NUmber");
      int num =1534236469;
    
      int lastNumber = 0;
      int reversNUmber=0;


    //   while (num !=0) {
    //      lastNumber = num % 10;
    //   System.out.print(lastNumber);
    //      num = num/10;
    //   }


      while (num !=0) {
         lastNumber = num % 10;
         reversNUmber = (reversNUmber*10)+lastNumber;
         num = num/10;
        }
        System.out.print(reversNUmber);
      
      
  }
    
}