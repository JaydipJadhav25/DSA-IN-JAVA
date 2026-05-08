public class LargestFun {
     
     public static String checkLagestString(String s1 , String s2){
          String result = "";
          // flow =?
          //1  use two pointer to pointing on two string and convert into
          // number and check and if same so skip check next 
          // if 

        
        int p1 = 0;
        int p2 = 0;

        // //travel on two string
        // for(int i = 0 ; i < s1.length() ; i++){
        //      //check
        // }

        while(p1 < s1.length() && p2 < s2.length()){
            //now check one by one
            if(s1.charAt(p1) == s2.charAt(p2)){
                //skip both elements
                p1++;
                p2++;
            }else{
                //elemt not same // now check grater
                if(s1.charAt(p1) < s2.charAt(p2)){
                  return s2;
                }else{
                  return s1;
                }
            }
        }


        //string is long than other string
        if(s1.length() < s2.length()){
             result = s2;
        }else{
       result = s1;
        }


        return  result;
     }
    

     public static void main(String[] x){
        
        System.out.print(checkLagestString("aaaaaaaaa" , "aaaaaaab"));

     }
}
