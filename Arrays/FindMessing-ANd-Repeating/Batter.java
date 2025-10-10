// package FindMessing-ANd-Repeating;

public class Batter {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,6,2,1,1};

        int missingno=-1;
        int repatingno  =-1;
        int [] hash = new int[arr.length+1];
        
        //hashing
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        //check
        for (int i = 1; i < hash.length; i++) {
            if(hash[i]==0){
                missingno = i;
            }
            else if (hash[i] == 2) {
                repatingno = i;
            }
        }


        System.out.println("missing : "+ missingno+ " : repatingno : "+ repatingno);
    }
}
