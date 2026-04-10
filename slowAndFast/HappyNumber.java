class Solution {
    public int sum(int num){
        int sum = 0;
        //loop
        while(num > 0){
            int last = num %10;
            num = num /10;
            //add in sum
            sum +=  last*last;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;

        while(fast!= 1){
        // int sumOfN = sum(n);
          slow = sum(slow);
        //   fast +=slow;
        //   fast += sum(n);
          fast = sum(sum(fast));

        //   fast = sum(n);
          //check cycle if found
          if(slow == fast && slow != 1){
            return false;
          }
          //update n
        //   n = sumOfN;
        
        }

        return true;
    }
}