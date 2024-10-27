public class Number {
    public static void main(String[] args) {
        int N = 4;  // Number of rows
        int num = 1;  // Starting number

        // Loop for each row
        for (int i = 1; i <= N; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
