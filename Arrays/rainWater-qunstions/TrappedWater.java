public class TrappedWater {
    public static void main(String[] args) {
        int[] arr = {4, 2,0,6,3,2,5};
        int [] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        int[] trapWater = new int[arr.length];
        int total  = 0;

        //finde left max
        leftMax[0] = arr[0];//first element
        for(int i=1 ; i<leftMax.length ; i++){
            //check
            if(leftMax[i-1] > arr[i]){
                leftMax[i] = leftMax[i-1];
            }else{
                leftMax[i] = arr[i];
            }
        }

         
    
         
        //right max array
        rightMax[rightMax.length-1] = arr[arr.length-1]; //last element  - init
        for(int i = rightMax.length-2 ; i>=0 ; i--){
             //check and stor
             if(rightMax[i+1]>arr[i]){
                rightMax[i] = rightMax[i+1];
                
             }else{
                rightMax[i] = arr[i];
             }
        }

        //now finde trap water is min(leftmax . rightmax) - current h = trapped water
           
        for(int i = 0 ; i<trapWater.length ; i++){
            //chekc and stor
            if(leftMax[i]<rightMax[i]){
                //left is small
                trapWater[i] = leftMax[i]-arr[i];
            }else{
              //right is smaller
              trapWater[i] = rightMax[i] -arr[i];
            }
        }



        //print 
        System.out.println("trapped water ");
         for(int i = 0 ; i<trapWater.length ; i++){
            total +=trapWater[i];
           System.out.print(trapWater[i]+ "");
        }
        System.out.println("total water is : " + total);



        // time complexity = o(n)
        // space complexity = o(n)




    }
}
