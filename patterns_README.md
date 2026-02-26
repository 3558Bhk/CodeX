// This is a class named patterns
// A class is like a blueprint that contains methods (functions)
public class patterns {

    // ================== PATTERN 1 ==================
    // Prints a square star pattern (n x n)
    public static void pattern1(int n) {

        // Outer loop controls ROWS
        // It runs n times
        for (int i = 0; i < n; i++) {

            // Inner loop controls COLUMNS
            // For each row, print n stars
            for (int j = 0; j < n; j++) {

                // Print star and space
                System.out.print("* ");
            }

            // After completing one row, move to next line
            System.out.println();
        }
    }


    // ================== PATTERN 2 ==================
    // Prints numbers from 0 to n-1 in each row
    public static void pattern2(int n) {

        // Outer loop for rows
        for (int i = 0; i < n; i++) {

            // Inner loop for columns
            for (int j = 0; j < n; j++) {

                // j increases from 0 to n-1
                // So each row prints: 0 1 2 3 ...
                System.out.print(j + " ");
            }

            // Move to next line
            System.out.println();
        }
    }


    // ================== PATTERN 3 ==================
    // Prints numbers in reverse order (n-1 to 0)
    public static void pattern3(int n) {

        // Outer loop for rows
        for (int i = 0; i < n; i++) {

            // Inner loop for columns
            for (int j = 0; j < n; j++) {

                // (n - 1 - j) gives reverse numbers
                // Example if n = 5:
                // j = 0 → 4
                // j = 1 → 3
                // j = 2 → 2
                // j = 3 → 1
                // j = 4 → 0
                System.out.print(n - 1 - j + " ");
            }

            // Move to next row
            System.out.println();
        }
    }


    // ================== PATTERN 4 ==================
    // Prints row number repeatedly
    public static void pattern4(int n) {

        // Outer loop controls row number
        for (int i = 0; i < n; i++) {

            // Inner loop prints same row number n times
            for (int j = 0; j < n; j++) {

                // i represents current row
                // So each row prints: 0 0 0 0 ...
                System.out.print(i + " ");
            }

            // Move to next row
            System.out.println();
        }
    }


    // ================== PATTERN 5 ==================
    // Prints reverse row numbers
    public static void pattern5(int n) {

        // Outer loop for rows
        for (int i = 0; i < n; i++) {

            // Inner loop for columns
            for (int j = 0; j < n; j++) {

                // (n - 1 - i) gives reverse row number
                // Example if n = 5:
                // i = 0 → 4
                // i = 1 → 3
                // i = 2 → 2
                // i = 3 → 1
                // i = 4 → 0
                System.out.print(n - 1 - i + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }


    // ================== MAIN METHOD ==================
    // Execution of program starts from here
    public static void main(String[] args) {

        // Size of pattern (5 x 5)
        int n = 5;

        // Calling each pattern method
        pattern1(n);

        System.out.println();

        pattern2(n);

        System.out.println();

        pattern3(n);

        System.out.println();

        pattern4(n);

        System.out.println();

        pattern5(n);
    }
}