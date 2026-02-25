// public class MinimumWindowSsubstring {

//     public static boolean checkTInStringS(int[] arr, String t) {
//         // travel loop baes on string check freq
//         // if missing return false
//         int len = t.length();

//         for (int i = 0; i < len; i++) {
//             // check in array
//             int curr = t.charAt(i);

//             // check
//             if (arr[curr] == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         String s = "ADOBECODEBANC";
//         String t = "ABC";

//         int m = s.length();
//         int n = t.length();

//         String res = "";
//         int max = Integer.MAX_VALUE;
//         int[] arr = new int[256];

//         int low = 0;

//         for (int i = 0; i < m; i++) {
//             // pdate freq in array
//             int charIdx = s.charAt(i);
//             arr[charIdx]++;

//             // info is corrent or wrong
//             while (checkTInStringS(arr, t)) {
//                 // finde len
//                 int len = i - low + 1;
//                 if (len < max) {
//                     max = len;
//                     // take string
//                     res = s.substring(low, i + 1);
//                     System.out.println(res);
//                 }
//                 // update low
//                 // requce
//                 int curr = s.charAt(low);
//                 arr[curr]--;
//                 low++;
//             }

//             // no nedd auto update i
//         }

//         System.out.println(max);
//         System.out.println(res);

//     }
// }





class Solution {
     public static boolean checkTInStringS(int[] arr, int[] arr2 ,  String t) {
        // travel loop baes on string check freq
        // if missing return false
        int len = t.length();

        // for (int i = 0; i < len; i++) {
        //     // check in array
        //     int curr = t.charAt(i);

        //     // check
        //     // if (arr[curr] <= 0) {
        //     //     return false;
        //     // }else{
        //     //     //reduce freq
        //     //     // arr[curr]--;
        //     // }

        //     //check same freq
        //     if(arr[curr] != arr2[curr]) return false;
        // }


           for (int i = 0; i < 256; i++) {
                  if(arr[i] < arr2[i]) {
                    return false;
                  }
            }
    
        return true;
    }



    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        String res = "";
        int max = Integer.MAX_VALUE;

        //1 .if m<n not chnage t cover in s retrn 
        if(m < n){
            return "";
        }
        // 2 . if length is same and chekc both are same
        if( m == n &&  s.equals(t) ){
            return t;
        }
         
        int[] arr = new int[256];
        int low = 0;

        //second array for t 
        int [] arr2 = new int[256];

        for (int i = 0 ;  i < n ; i++){
            //add in array
            int charIdx = t.charAt(i);
            arr2[charIdx]++;
        }


        for (int i = 0; i < m; i++) {
            // pdate freq in array
            int charIdx = s.charAt(i);
            arr[charIdx]++;

            // info is corrent or wrong
            while (checkTInStringS(arr, arr2 ,t)) {
                // finde len
                int len = i - low + 1;

                if (len < max) {
                    max = len;
                    // take string
                    res = s.substring(low, i + 1);
                }
                // update low
                // requce
                int curr = s.charAt(low);
                arr[curr]--;
                low++;
            }

            // no nedd auto update i
        }


        return res;
    }
}
