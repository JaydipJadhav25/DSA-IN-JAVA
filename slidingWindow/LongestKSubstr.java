import java.util.HashMap;

public class LongestKSubstr{
    public static void main(String[] args) {


        // String s, int k //inputs
                // code here
        int result = -1;
        int low= 0;
        int high = 0;
        int n = s.length();
       HashMap<Character, Integer> map = new HashMap<>();
        
        //loop
        for(int i = high ; i < n ; i++){
            
            //add in hashmap
            // map.merge(s.charAt(i), 1, Integer::sum);
            // The old way (pre-Java 8)
            char curr = s.charAt(i);
            
                if (map.containsKey(curr)) {
                    
                    map.put(curr, map.get(curr) + 1);
                    
                } else {
                    
                    map.put(curr, 1);
                }
                
            // map.merge(i, 1, Integer::sum);
            
            //if size() > k 
            while(map.size() > k){
                //remove element in hashmap
                //remove frequncy of low element
             char current = s.charAt(low);
             
                int currentVal = map.get(current);
                
                int newval = currentVal-1;
                map.put(current, newval);
                
                //if val zero so remove key
                if(map.get(current)==0){
                    //remove from key
                    map.remove(current);
                }
                //update low
                low++;
                
            }
            
            //size is equal than k
            if(map.size()== k){
                //
                int len = i - low +1;
                //fnde map
                result = Math.max(result , len);
            }
            
            
            
            
        }
        
        

        
        
        // return result;
        System.out.println("resulr :" + result);
        
    }
}