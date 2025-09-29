// package Longest-Consecative;

public class BruteForce {
    public static boolean linerSerach(int[] arr , int num){

        for (int i = 0; i < arr.length; i++) {
            //check
            if(arr[i] == num){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = new int[] { 102 , 4 ,100 , 1,101 , 3,2,1,1};
        int longest = 1;

        //loop on each element
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int x= arr[i];//curret
            // System.out.println(x);
            while ((linerSerach(arr , x+1)) == true) {
                count++;
                x += 1;
                // System.out.println("....");
            }
            //take max
            longest = Math.max(longest, count);
            // System.out.println(longest);


        }
        System.out.println("logest count : "+ longest);
    }
    
}
