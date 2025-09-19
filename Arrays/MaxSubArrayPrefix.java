public class MaxSubArrayPrefix {
    public static void main(String[] args) {
         int[] number = new int[]{1 ,2, 3, 4, 5, 6, 7 ,8};
        
         int[] prefix = new int[number.length];


         //frist element stor
         prefix[0] = number[0];
         for(int i =1; i<prefix.length ; i++){
            prefix[i] = prefix[i-1]+number[i];

        }
        
         //
         int max = Integer.MIN_VALUE;

        for(int i =0 ; i<number.length;i++){
            int start = i;
            int sum =0;
           for(int j = i+1 ;j<number.length ; j++ ){
            int end = j;
             //use prefix
             sum = start == 0 ?prefix[end] : prefix[end] - prefix[start+1];
           }
           if(max < sum){
            max = sum;
           }
        }

        System.out.println("Maximun Numbe is : "+ max);

         
    }
}
