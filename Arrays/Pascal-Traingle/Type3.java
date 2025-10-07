import java.util.ArrayList;
import java.util.List;

public class Type3 {
    // This method generates a single row of Pascal's triangle.
    public static List<Integer> genrateRow(int row) { // FIX 1: Changed return type
        long ans = 1;
        List<Integer> tempList = new ArrayList<>();
        
        // The first element of any row is always 1.
        tempList.add(1);

        // Calculate the rest of the elements in the row.
        for (int col = 1; col < row; col++) { // FIX 2: Corrected loop increment
            ans = ans * (row - col);
            ans = ans / col;
            tempList.add((int) ans); // FIX 3: Cast long to int
        }
        return tempList;
    }

    public static void main(String[] args) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        int numRows = 6;

        // Generate each row up to the specified number.
        for (int i = 1; i <= numRows; i++) {
            pascalTriangle.add(genrateRow(i));
        }
        System.out.println(pascalTriangle);

    }
}