// package Assignment;

public class Assignment1 {
    public static boolean check(int[] arr , int n){
      
        //outer loop
        for(int i =0 ; i<n;i++){
            //inner loop
            for(int j =i+1; j<n;j++){
                //check element is exist
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        //no exists
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        //check
        System.out.println("reuslt : " + check(arr , arr.length));

    
    }
}
