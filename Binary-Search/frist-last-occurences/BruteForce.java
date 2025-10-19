// package frist-last-occurences;

public class BruteForce {
    public static void main(String[] args) {
        int[] arr = new int[]{ 2,4,6,8,8,8,11,13};
        // int x = 8;
        // int x = 10;
        int x = 11;


        int first = -1;
        int last = -1;
        //loop
        for (int i = 0; i < arr.length; i++) {
            
            if(first == -1 && arr[i] == x){
                first = i;
                last = i;
            }else if(first != -1 && arr[i]== x){
                last = i;
            }

        }

        System.out.println("frist : "+ first +" last : "+ last);

    }
    
}
