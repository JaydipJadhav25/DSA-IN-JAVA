// package misssingValues;

public class FindMissingvalue {
    public static void main(String[] args) {
        int [] arr = new int[]{1 ,2 ,3 ,5};
        int n = 5;

        //1.brute force
        for(int i =1 ; i<=n ; i++){
            //inner loop
            int flag = 0;
            for(int j=0 ; j<arr.length ; j++){
                //check
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            //check flag
            //if flag is 0 that means current element is not in array
                if(flag == 0){
                    System.out.println("this is missing value is array : "+ i);
                    break;
                }
        }
    }
}
