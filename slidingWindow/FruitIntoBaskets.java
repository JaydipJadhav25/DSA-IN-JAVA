import java.util.HashMap;

public class FruitIntoBaskets {
        public int totalFruit(int[] fruits) {
        int res = 0;
        int low = 0;
        int high = 0;
        int n = fruits.length;
         HashMap<Integer, Integer>  map = new HashMap<>();
        //loop
        for(int i = 0 ; i < n ; i++){
            //add => update
            map.merge(fruits[i] , 1, Integer::sum);

            //loop -reduce low
            while(map.size() > 2){
                //reduces
              int curr = map.get(fruits[low]);

              int newVal = curr-1;

              map.put(fruits[low], newVal);
              
              //check key val 
              if(map.get(fruits[low]) == 0){
                map.remove(fruits[low]);
              }
              low++;
            }

            //cal
            int len = i - low +1 ;
            res = Math.max(res , len);
        }//end


        return res;
    }

    public static void main(String[] args) {
         
        int ans = totalFruit({1,2,1 });


    }
    
}
