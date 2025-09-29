import java.util.ArrayList;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr = new int[]{10 , 22  , 12, 2, 3, 0, 6};
             ArrayList<Integer> leders = new ArrayList<>();
        //outet loop
        for (int i = 0; i < arr.length; i++) {
             boolean lederCurrent = true;
             for (int j = i+1; j < arr.length; j++) {
                //check
                if(arr[j] > arr[i]){
                    //no
                    lederCurrent = false;
                    break;
                }
             }
             //add 
             if(lederCurrent){
                //add
                leders.add(arr[i]);
                
             }
        }

        //print
        for(Integer led : leders){
            System.out.print(led+" ");
        }


    }
    
}
