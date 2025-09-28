// package Sort0-1-2;

public class Better {
 public static void main(String[] args) {
    int [] arr = new int[] {1 ,2, 0 ,0 ,1,1 , 2,0};

    //pointers
    int cot0 = 0;
    int cot1 = 0;
    int cot2 = 0;


    //finde count use loop
    for(int i=0; i <arr.length ; i++){
        //check and update
        //0
        if(arr[i] == 0) cot0++;
        if(arr[i] == 1) cot1++;
        if(arr[i] == 2) cot2++;
    }
    //update in array
    //0
    for(int i =0 ; i<cot0 ; i++){
        arr[i] = 0;
    }
     //1
    for(int i =cot0; i<cot0+cot1 ; i++){
        arr[i] = 1;
    }
     //2
    for(int i =cot0+cot1; i<arr.length; i++){
        arr[i] = 2;
    }
    //print
     //0
    for(int i =0 ; i<arr.length; i++){
       System.out.print(arr[i]+" ");
    }








 }
}
