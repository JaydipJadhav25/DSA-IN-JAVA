public class SunArrays {

    public static void main(String[] args) {
         int[] arr = new int[]{1 ,2, 3, 4, 5, 6, 7 ,8};
          
        int total = 0;
        int n =arr.length;
        int length = ((n*(n+1))/2);
        System.out.println("formula : "+((n*(n+1))/2));

        int[] hash = new int[length+1];
         //outer loop
         for(int i=0 ; i<arr.length ; i++){
            //start
            int start = i;
            
            //inner loop 
            for(int j= i; j<arr.length; j++){
                //end
                int end = j;
                //print start to end
                int sum = 0;
                 for(int k =start ; k<=end;k++){
                    //print
                    System.out.print(arr[k]+"");  
                    // System.out.print(total);  
                    sum +=arr[k];
                    // hash[total] +=k;
                 }

                 System.out.print(" ");
                //  System.out.print(sum+" - ");
                
                 hash[total]  =sum;
                 total++;
                }
                System.out.println();
         }

        //  System.out.println("total sunArray is :"+total);


        //  for(int i =0 ; i<hash.length ; i++){
        //     System.out.print(hash[i]+" ");
        //  }

         //find maximun
         int max = Integer.MIN_VALUE;
         int index=  -1;
         for(int i =0  ; i<hash.length;i++){
            if(max<hash[i]){
                max = hash[i];
                index = i;
            }
         }

         System.out.println("max addition of sun aarray No is :"+ index +"and addition is: "+ max);
        
         //fine largest
         max = hash[0];
         index = 0;
        for(int i =0  ; i<hash.length-1;i++){
            if(max>hash[i]){
                max = hash[i];
                index = i;
            }
         } 
         System.out.println("largest array idx :" + index +"and addition is largest: "+ max);

    }
     
}