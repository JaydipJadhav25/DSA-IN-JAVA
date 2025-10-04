// package Sprial-Traversal;
    import java.util.ArrayList; // Or LinkedList, Vector, etc.
    import java.util.List;

public class Solution {
  public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;//row
        int n  = matrix[0].length;//column
        int top = 0; //frist of row
        int bottom = m-1;//last of row
        int left = 0;//first ele of col
        int right = n-1;//last ele of column
          List<Integer> result = new ArrayList<>(); 
    
          while (top <= bottom && left <=right) {
            //right
            for (int i = left; i <=right; i++) {
                 result.add(matrix[top][i]);
            }
            top++;
            //bottom
            for (int i =top; i <=bottom; i++) {
                 result.add(matrix[i][right]);
            }
            right--;
            //left
           //check for single row
           if(top <= bottom){
            for (int i =right; i >=left; i--) {
                 result.add(matrix[bottom][i]);
            }
            bottom--;
           }
            
            //top
            //also check left and right element
            if(left<=right){
                 for (int i =bottom; i >= top; i--) {
                 result.add(matrix[i][left]);
            }
            left++;
            }

            
          }



          return result;

    }
    public static void main(String[] args) {
          List<Integer> elements = new ArrayList<>(); 
         int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
           
          System.out.println(spiralOrder(matrix));
    }
    
}
