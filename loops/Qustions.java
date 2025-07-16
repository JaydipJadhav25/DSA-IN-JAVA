import java.util.Scanner;

public class Qustions {
    public static void main(String[] args) {
         //1.
        //  for(int i =0; i<5; i++){
        //     System.out.println(i);
        //     i+=2;
        //  }

         //2.WriteaprogramtoprintthemultiplicationtableofanumberN,

        //  int n = 3;
        //  for(int i = 1 ; i<=10; i++){
        //  System.out.println(n+" * "+i+" = "+(n*i));
        //  }

         //3.
         Scanner sc = new Scanner(System.in);

//          int num ;
//          int choise ;
//          int oddSum = 0;
//          int evenSum = 0;

//         do{
//             System.out.print("Enter the number ");
//             num = sc.nextInt();
//             if(num % 2 == 0){
//                 System.out.println("Number is Even");
//                 evenSum +=num;
//             }else{
//              System.out.println("Number is ODD");
//              oddSum +=num;
//             }
//             System.out.println(" total sum : 1.Even : "+evenSum +" and 2.Odd : "+ oddSum);
//             System.out.println("Do you continues this ? press 1 for yes or 0 fro no");
//             choise = sc.nextInt();
//         }while(choise == 1);
        
// System.out.println("Thank You ");

        //4. factorial of any number

        // System.out.print("Enter the number ");
        // int  n= sc.nextInt();
//          num = sc.nextInt();
        // int  factorialNumber =1 ;
        // for(int i = 2 ; i<=n; i++){
        //   factorialNumber  *= i;
        // }

        // while (n >= 1) {
        //      factorialNumber *=n;
        //      n--;
        // }
        // System.out.println("factroril of"+n+" is : "+factorialNumber);
  
         
        //5.
        // for(int i = 1; i<=30; i++){
        //     //for 3 multiple
        //     if(i%3 == 0 && i%5 == 0){
        //         System.out.println("Fizz Buzz "+i);  
        //     }
        //     else if(i%3 == 0){
        //         System.out.println("fizz "+i);
        //     }else if(i%5 == 0 && i%5 == 0){
        //         System.out.println("buzz "+i);
        //     }
        //     else{
        //         System.out.println(i);
        //     }
        // }

        //5 => in optimize way
// 1
// 2
// fizz 3
// 4
// buzz 5
// fizz 6
// 7
// 8
// fizz 9
// buzz 10
// 11
// fizz 12
// 13
// 14
// Fizz Buzz 15
// 16
// 17
// fizz 18
// 19
// buzz 20
// fizz 21
// 22
// 23
// fizz 24
// buzz 25
// 26
// fizz 27
// 28
// 29
// Fizz Buzz 30


        int counter3=0;
        int counter5=0;
    for(int i =1; i<=30;i++ ){
        counter3++;
        counter5++;

        //1.
        // if(counter3 == 3){
        //     System.out.println("Fiuzz");
        //     counter3 = 0;
        // }else if(counter5 ==5){
        //     System.out.println("buzz");
        //     counter5 = 0;
        // }else{
        //         System.out.println(i);
        // }


        //2.
        if(counter3 !=3 && counter5 !=5){
            System.out.println(i);
        }
        if(counter3 == 3){
             System.out.println("Fiuzz");
             counter3 = 0;
          }
          if(counter5 ==5){
             System.out.println("buzz");
              counter5 = 0;
         }
    }



    }
}
