/*
Q4: Java Program to Create an Array with User Input Using Exception Handling

============================================================================
Ans.
Why try–catch is used in this program?

1. While taking array size:
   - nextInt() can throw InputMismatchException if user enters a non-integer.
   - try–catch prevents program crash and shows a user-friendly message.

2. While taking array values:
   - Each value input is also checked using try–catch.
   - Ensures only valid integers are stored in the array.
   - If invalid input occurs, program shows message and exits safely.

Overall purpose:
- To handle wrong user inputs without crashing the program.
- To make the program more user-friendly and error-proof.
 */


package array.basic.mypractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        // Step 1: Take array size safely
        try {
            System.out.print("Enter array size: ");
            n = sc.nextInt();   // may throw InputMismatchException
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Array size must be an integer.");
            return; // exit program
        }

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Take array values safely
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            try {
                arr[i] = sc.nextInt();   // may throw InputMismatchException
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter only integers.");
                return; // exit program
            }
        }

        // Step 4: Print array details
        System.out.println("\nIndex\tMemory Address\t\tValue");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < n; i++) {

            // identityHashCode prints memory-like hash (not real memory address)
            String address = Integer.toHexString(System.identityHashCode(arr));

            System.out.println(i + "\t0x" + address + "\t\t\t\t\t" + arr[i]);
        }

        sc.close();
    }
}
