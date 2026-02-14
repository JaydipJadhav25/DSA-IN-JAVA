class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int low = 0;
        int n = s.length();
        int k = 0;
        Map<Character, Integer> map = new HashMap<>();

        //loop
        //i => high
        for(int i =0 ; i<n ; i++){
          //add in hashmap
          map.merge(s.charAt(i) , 1 ,  Integer::sum);
          //calculat lenght 
          k = i -low +1;
          //check size in less than k so duplicate elements
          while(map.size() < k){
            //remove low
            char curr = s.charAt(low);
            int currentVal = map.get(curr);
            //update
            map.put(curr , currentVal-1);
            //check val of key and remove
            if(map.get(curr) == 0){
                map.remove(curr);
            }
            //update loww
            low++;
            //update k 
            k = i - low +1;
          }

          //now this section size is ==k 
          //finde length 
           res = Math.max(res , k);
        }


        return res;
    }
}