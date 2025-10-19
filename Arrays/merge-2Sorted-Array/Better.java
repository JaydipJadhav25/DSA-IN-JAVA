import java.util.Arrays;

public class Better {
   public static void main(String[] args) {
       int[] a= new int[]{1 ,3,5,7};
      int[] b= new int[]{0 ,2,6,8,9};
      int n= a.length;
      int m= b.length;
      int big = n-1;
      int small = 0;
       
      //loop on first array
    //   for (int i = 0; i < n; i++) {
    //     //check and swap
    //     if(a[big] < b[small]){

    //     }
        
    //   }


    while (big >= 0 && small < m) {
        //swap
        if (a[big] > b[small]) {
            //swap
            int temp = a[big];
            a[big] = b[small];
            b[small] = temp;
            big--;
            small++;
            
        }else {
            // big--;
            // small++; //no need to check beacue alreay in sorted arrays
            break;

        }
        
    }

    //sort both
    Arrays.sort(a);
    Arrays.sort(b);
    //print
    
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    


   }
    

}
