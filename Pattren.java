public class Pattren {
    public static void main(String[] args) {
        int N = 4;  // Number of rows

        // Loop for each row
        for (int i = 1; i <= N; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

    

