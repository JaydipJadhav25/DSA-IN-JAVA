import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("give a number do want to check how many time is present array:");
        int q = sc.nextInt();


         //finde max element
        int maxnumber =  arr[0];
        
        for(int i=1 ; i<n ; i++){
            //finde max number 
            if(maxnumber <arr[i]){
                maxnumber = arr[i];
            }
        }

        System.out.println("max number in aarray is : "+maxnumber);



         
        int[] hash = new int[maxnumber+1]; // automatically filled with 0
        
        //preprosing =>hashing 
        for(int i =0 ; i<n ; i++){
            //create hash for  only give input size
            hash[arr[i]]  +=1; // arr[i] ans in stro as a index
        }

        for(int i =0 ; i<=maxnumber ; i++){
            System.out.print(hash[i]+" ");
        }

      



           System.out.println("Number : "+q+"Present "+hash[q]);

    }
}
