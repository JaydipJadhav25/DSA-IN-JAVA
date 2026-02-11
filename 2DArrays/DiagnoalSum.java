public class DiagnoalSum {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6 ,7, 8},
                {9, 10, 11, 12},
                {12, 7, 1, 1}
            };


      //brute force  = o(n^2);
      int sum = 0;
    //   for (int i = 0; i < matrix.length; i++) {
    //      for (int j = 0; j < matrix[0].length; j++) {
    //         //primary
    //         if (i == j) {
    //             sum += matrix[i][j];
    //         }else if (i+j == matrix.length-1) {
    //             sum +=matrix[i][j];
    //         }
    //      }
    //   }          

    //   System.out.println("sum : "+ sum);

    for (int i = 0; i < matrix.length; i++) {
        
        //primary 
        sum += matrix[i][i];

        // for secondary 
        //i + j = n-1 
        // j = n-1 -i
        if (i != matrix.length -1-i) {
            sum += matrix[i][matrix.length-1-i];
        }
    }
    System.out.println("sum : "+ sum);
        
    }
}
