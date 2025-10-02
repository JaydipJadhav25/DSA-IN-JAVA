// package set-matrix;

public class Better {
    
    public static void print(int[][] matrix){
        // : Print the matrix to verify
        System.out.println("\nYour 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
int[][] matrix = {
    {1, 2, 3, 3},
    {5, 2, 7, 8},
    {9, 2, 11, 12},
    {13, 14, 0, 16}
};

//print
print(matrix);
 
int m = matrix.length;
int n = matrix[0].length;

int[] col = new int[m];
int[] row = new int[n];


//1 . loop whole array and track 
//row
for (int i = 0; i < row.length; i++) {
    //column
    for (int j = 0; j < col.length; j++) {

        //check if zero mark row and index
        if(matrix[i][j] == 0){
            row[i] = 1;
            col[j] = 1;
        }
    }
    
}


//2 . update zeros as depent on row and col
for (int i = 0; i < row.length; i++) {
    for (int j = 0; j < row.length; j++) {
        if(row[i] == 1 || col[j]==1){
         //make as zero
         matrix[i][j] = 0;
        }
    }
}


//print
print(matrix);

    }
    
}
