public class Pattern3 {
    public static void main(String[] args) {
        for(int i =0 ; i<5 ; i++){
            //space
            for(int j =0 ; j<(5-i-1) ; j++){
                System.out.print(" ");
            }

            //star
            for(int s= 0; s<(2*i+1) ; s++){
                System.out.print("*");
            }

             //space
            // for(int j =0 ; j<(5-i-1) ; j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }




        //////////////////////
    for (int i = 1; i <= 5; i++) {
    // spaces before stars
    for (int j = 1; j <= (5 - i); j++) {
        System.out.print(" ");
    }

    // stars
    for (int s = 1; s <= (2 * i - 1); s++) {
        System.out.print("*");
    }

    // optional spaces after stars (for symmetry, not needed visually)
    for (int j = 1; j <= (5 - i); j++) {
        System.out.print(" ");
    }

    System.out.println();
}

    }
}
