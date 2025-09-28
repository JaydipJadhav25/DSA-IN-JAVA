// package Majority-Element;

public class Optimal {
    public static void main(String[] args) {
        int[] arr = new int[]{7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        int n = arr.length;
        int ele =0; 
        int count= 0;
        for(int i=0; i<arr.length ; i++){
            if(count == 0){
                //new element
                ele = arr[i];
                count =1;
            }else if(ele == arr[i]){
                count++;
            }else{
                count--;
            }
            
        }

        //2.varify ele
       int countt = 0;

        for(int i=0 ; i<n ; i++){
            if(arr[i] == ele){
                countt++;
            }
        }

        if(countt > (n/2)){
            
            System.out.println("majority element is : "+ ele);
        }
        else{
            System.out.println("majority element is : "+ -1);
        }

        //if


    }
    
}
