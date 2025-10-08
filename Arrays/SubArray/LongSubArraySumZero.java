import java.util.HashMap;

public class LongSubArraySumZero {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -1,3 ,2,-2 ,-8,1,7,10,25};
        int n = arr.length;
        // int target = 0 ;
        //hashing i use array
        // int[] hash = new int[arr.length];
        // hash[0] = arr[0];//first
        // for(int i =1 ; i<n ; i++){
        //     //store sum
        //     hash[i] = hash[i-1]+arr[i];
        // }

        //use hash map
        HashMap<Integer , Integer> hash = new HashMap<Integer , Integer>();


        //loop to calcaulate some and find len
        int len = 0;
        int sun = 0;
        // int target = 0;
        for(int i=0 ; i<arr.length ; i++){
            
            sun +=arr[i];

            if(sun == 0){
                 len = i+1;
                 System.out.println("i" +i+"len :"+ len);
            }else{
                //check in map
                if(hash.get(sun) != null){
                    //that means sum is persent and index
                    //check
                    System.out.println(len);
                    len = Math.max(len,i - hash.get(sun));
                    System.out.println("-"+hash.get(sun)+ "and i: "+i);
                    System.out.println("thisi len :"+len);

                }else{
                    //add in has
                    hash.put(sun, i);
                }
            }
           
        }


System.out.println("lengh is : "+ len);

    }
    
}
