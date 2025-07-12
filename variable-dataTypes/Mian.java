import java.util.*;

public class Mian {
public static void main(String[] args) {
   System.out.println("VARIABLES & DATA TYPES QUESTIONS");
//    System.out.println("Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers \n");
   Scanner sc = new Scanner(System.in);
//    int a =sc.nextInt();
//    int b =sc.nextInt();
//    int c =sc.nextInt();
//    float avg = (a+b+c)/3.0f;
//    This is wrong unless you divide by 3.0f or cast to float.
// Because (a + b + c) and 3 are int, result is still int
// Then it’s converted to float, but too late — precision is lost.

    

//    System.out.println(" avarage : "+avg);


// System.out.println("Question2:Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.");

//  int side = sc.nextInt();
//  int area = side * side ;
//  System.out.println("area is super : "+ area);

// Use int for simple, whole number calculations.

// Use float or double when precision and decimals matter.

 System.out.println("Question3");
   float a = sc.nextFloat();
   float b = sc.nextFloat();
   float c = sc.nextFloat();
   float bill =  a+b+c ;
   float gst = bill * 18 / 100; // calculate 18% GST
   float total = bill + gst;    // final amount after adding GST

    System.out.println("Total Dil : "+bill); 
    System.out.println("GST (18%): Rs. " + gst);
    System.out.println("Total with GST: Rs." + total);


/////////////////////////////////////////////////////////////////////////////////////////////
/// 
//  float a = sc.nextFloat();
//  int b = (int)a;
//  float d= 123f;
//  char c  = 'c';
//  System.out.println(a);
//  System.out.println(b+c);
}
    
}