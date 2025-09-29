
public class BruteForce {
    public static void main(String[] args) {
        int[] arr = {3,-2 ,1 , 5,-1 , -5};

        //
        int[] posivite = new int[arr.length/2];
        int[] negative = new int[arr.length/2];
        //add in loop
        int idexp =0;
        int idexn =0;
        for(int i=0 ; i<arr.length ; i++){
            //positive
            if(arr[i] >0){
                posivite[idexp++] = arr[i];
            }else{
                negative[idexn++] = arr[i];
            }
        }

        //re-arreange
        for(int i=0 ; i<arr.length/2 ; i++){
            //add positive
            arr[i*2] = posivite[i];
            arr[i*2+1] = negative[i];
        }
        //print
         for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}