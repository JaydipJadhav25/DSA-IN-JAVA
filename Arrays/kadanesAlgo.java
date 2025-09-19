public class kadanesAlgo {
    public static void main(String[] args) {
        int[] number = {-2, -3  ,4,-1, -2 ,1, 5,-3};

         int max = Integer.MIN_VALUE;
         int cs =0;
        for(int i=0 ; i<number.length ; i++){
           cs +=number[i];

           //nigavite convert into zero
           if(cs<0){
            cs =0 ;
           }
           //compare
           if(max<cs){
            max = cs;
           }
        }
        System.out.println("max sub array is : "+ max);
    }
}
