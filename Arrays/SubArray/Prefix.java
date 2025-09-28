public class Prefix {
    public static void main(String[] args) {
        int[] arr = {2 ,3 ,5};
        
        //make prefix array
        int[] prefix = new int[arr.length];

        //make hashinf
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        //loop to calcaulate some and find len
        int len = 0;
        int target = 5;
        for(int i=0 ; i<arr.length ; i++){
         int start = i;
         int sum = 0;
           for(int j =i+1 ; j<arr.length ; j++){
            int end = j;
             //use prefix
             sum = start == 0 ?prefix[end] : prefix[end] - prefix[start+1];
             //check sum
             if(target == sum){
                len = Math.max(len, j-i+1);
             }
           }
        }
        System.out.println("len : "+ len);
    }
}
