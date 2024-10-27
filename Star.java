public class Star {
    public static void main(String[] args) {
        int i, j;
        int N = 5;  // Fixed number of rows

        // Loop for each row
        for (i = 1; i <= N; i++) {
            // Print leading spaces
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars in each row
            for (j = 1; j <= N; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

    

