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

        System.out.print("Enter the number ");
        int  n= sc.nextInt();
//          num = sc.nextInt();
        int  factorialNumber =1 ;
        // for(int i = 2 ; i<=n; i++){
        //   factorialNumber  *= i;
        // }

        while (n >= 1) {
             factorialNumber *=n;
             n--;
        }
        System.out.println("factroril of"+n+" is : "+factorialNumber);



    }
}
