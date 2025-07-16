import java.util.*;

public class Main{
    public static void main(String[] args) {
     System.out.println("...............Loops.............");
     System.out.println("|| While Loop ||");
     int  counter =0;
    //  while (counter <=10) {
    //     System.out.println(counter);
    //     // ++counter;
    //     counter++;
    //  }

    //  Scanner sc = new Scanner(System.in);
    //  int input = sc.nextInt();
    //  while (counter <= input) {
    //      System.out.println(counter +" to "+ input);
    //     // ++counter;
    //     counter++;
    //  }


    //sun to natural numbers
//    int sum = 0;
//    int nNumber= 1;
   //  int input = sc.nextInt();
//    while(nNumber <= input){
//     sum +=nNumber;
//     System.out.println("number : " + nNumber+" and sum "+sum);
//      nNumber++;
   
//    } 
//    System.out.println("Sum of N natural Numbers : "+sum);


//for loop
for(int i = 1; i<=10; i+=1){
    System.out.println("i :"+i);
}
for(int i = 11; i<=10; i+=1){
    System.out.println("i :"+i);
}

//print 
// ****
// ****
// ****
// ****
 //simple
 while (counter <4) {
    System.out.println("* * * *");
      counter++;
 }


while (counter <= 4) {
    int i =0;
  while (i <=4) {
    System.out.print(" * ");
    i++;
  }
  System.out.println("");
  counter++;
}
System.out.println("");
for(int i = 0 ; i <4; i++){
   for(int j = 0 ; j <4; j++){
    System.out.print(" * ");
}
System.out.println("");
}


}
}