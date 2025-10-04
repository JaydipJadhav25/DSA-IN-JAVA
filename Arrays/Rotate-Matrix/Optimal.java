// package Rotate-Matrix;

import java.util.Arrays;
import java.util.Collections;

public class Optimal {
           /**
     * Reverses the elements of each row in a 2D integer array (matrix) in-place.
     *
     * @param matrix The 2D array to be modified.
     */
    public static void reverseMatrixRows(int[][] matrix) {
        // Check for null or empty matrix to avoid errors.
        if (matrix == null || matrix.length == 0) {
            return;
        }

        // Iterate through each row of the matrix.
        for (int[] row : matrix) {
            // Use the two-pointer technique to reverse the current row.
            int left = 0;
            int right = row.length - 1;

            // Continue swapping until the pointers meet or cross in the middle.
            while (left < right) {
                // 1. Store the left element in a temporary variable.
                int temp = row[left];
                
                // 2. Move the right element to the left position.
                row[left] = row[right];
                
                // 3. Move the stored (original left) element to the right position.
                row[right] = temp;

                // 4. Move the pointers closer to the center for the next swap.
                left++;
                right--;
            }
        }
    }

    /**
     * A helper function to print the matrix in a readable format.
     *
     * @param matrix The matrix to be printed.
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

 
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };
            
            //print
            // print(matrix);
            printMatrix(matrix);
            System.out.println();


            //1 , frist transpose
        int n = matrix.length;
        for(int i = 0 ; i<=n-2 ; i++){
            //
            for(int j = i+1; j<=n-1 ; j++ ){
                //swap only right half
                int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] =temp;

            }
        }

        
         //print
        //  print(matrix);
        printMatrix(matrix);
            System.out.println();

        //revers array
        //  Collections.reverse(Arrays.asList(matrix));
        reverseMatrixRows(matrix);

         //print
        //  print(matrix);
        printMatrix(matrix);
       

    }
    
}
