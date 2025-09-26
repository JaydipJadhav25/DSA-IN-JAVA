// package misssingValues;

public class FindMissingvalue {
    public static void main(String[] args) {
        int [] arr = new int[]{1 ,2 ,3 ,5};
        int n = 5;

        //1.brute force
        for(int i =1 ; i<=n ; i++){
            //inner loop
            int flag = 0;
            for(int j=0 ; j<arr.length ; j++){
                //check
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            //check flag
            //if flag is 0 that means current element is not in array
                if(flag == 0){
                    System.out.println("this is missing value is array use brute force : "+ i);
                    break;
                } 
        }

        //2.better solution
        int[] hash = new int[n+1];

        for(int i =0 ; i<arr.length ; i++){
            //mark in hash array
            hash[arr[i]] =1;
        }

        //re-itrasion of array
        for(int i=1 ; i<n ; i++){
            //check
            if(hash[i] == 0){
                System.out.println("missing element is  from better method use hash: "+ i);
                break;
            }
        }


        //3.optimal =>1.sum
        int sum = ((n*(n+1))/2); 
        int s2 = 0;
        for(int i=0 ; i<arr.length ; i++){
            s2 +=arr[i];
        }

        System.out.println("missing value is  from optimal method of use sum: " +(sum-s2));



        //optimal =>2.xor

        int xor1 = 0;
        int xor2 =0 ;
        for(int i=0;i<arr.length ; i++){
            xor1 = xor1 ^ arr[i]; // add array element
            //add a to n elemt
            xor2 = xor2 ^(i+1);

        }
        //add last element
        xor2 = xor2 ^ n;
        System.out.println("missing value is  from optimal method of use XOR : " +(xor1 ^ xor2));




        
    }
}
