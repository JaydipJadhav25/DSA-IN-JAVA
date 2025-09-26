public class Consecative {
    public static void main(String[] args) {
        int[] arr = {1 ,1, 0 ,1,1,1, 0 ,1,1};

        int max = 0;
        int count = 0;
        for(int i =0 ; i<arr.length ; i++){
            //check
            if(arr[i] ==1 ){
                count++;
            }else{
                count=0;
            }
            if(count > max){
                max = count;
            }
        }

        System.out.println("maximun consecutive one is :"+ max);


    }
}
