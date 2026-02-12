public class SearchInSortedArray {
    public static void main(String[] args) {
                int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6 ,7, 8},
                {9, 10, 11, 12},
                {12, 7, 1, 1}
            };
        
            int key = 12;


            //stria search
        int row = 0;
        int col = matrix[0].length-1;
        System.out.println(row +" : "+ col);
        //loop
        while (row < matrix.length && col >= 0) {
            //check
            if (matrix[row][col] == key) {
                System.out.println("element found! : "+ row +" and "+ col);   
                break;
            }else if (key < matrix[row][col]) {
                  col--;
            }else{
                row++;
            }
        }


        System.out.println("not fount");
    }
}
