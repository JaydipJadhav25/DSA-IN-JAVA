import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // Check if number is less than 1
        if (n < 1) {
            System.out.println("Number is not a natural number");
            return;
        }

        // Process to calculate sum from 1 to n
        for (int val = 1; val <= n; val++) {
            sum = sum + val;
        }

        System.out.println("Sum is " + sum);
    }
}
