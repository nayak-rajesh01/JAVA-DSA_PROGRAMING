/*
Q5: Java Program for Safe Array Input Using Nested Try-Catch with Continuous Validation

======================================================================================

PURPOSE OF TRY–CATCH IN THIS PROGRAM

1. Taking array size:
   - User may enter alphabets, symbols, decimals, or invalid numbers.
   - nextInt() throws InputMismatchException for such wrong inputs.
   - try–catch ensures program does NOT crash.
   - User is repeatedly asked until a valid integer size is entered.

2. Taking array values:
   - Each array element input is also protected with its own try–catch.
   - If user enters invalid data (e.g., 'a', 4.5, @), it catches the exception.
   - Prevents crash and forces user to enter only integer values.
   - sc.nextLine() clears the wrong input from buffer.

3. Printing memory address:
   - System.identityHashCode(arr) is used to show a hash-like reference.
   - This is NOT the real memory address, but a unique identifier.

Overall purpose:
   ✔ Prevent program from crashing on wrong inputs
   ✔ Provide user-friendly messages
   ✔ Allow re-entering values until they are correct
   ✔ Demonstrate robust and safe exception handling in Java
 */

package array.basic.mypractice;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        // Step 1: Take array size safely (keeps asking until correct)
        while (true) {
            try {
                System.out.print("Enter array size: ");
                n = sc.nextInt();     // may throw InputMismatchException

                if (n <= 0) {
                    System.out.println("Size must be positive. Try again.");
                    continue;
                }
                break; // correct input → exit loop
            }
            catch (InputMismatchException e) {
                // PURPOSE: Handle wrong input (like alphabets / symbols)
                System.out.println("Invalid input! Array size must be an integer.");
                sc.nextLine(); // clear buffer
            }
        }

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Take array values safely (loop until correct input)
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {

            while (true) {
                try {
                    arr[i] = sc.nextInt();  // may throw InputMismatchException
                    break; // valid input → break inner loop
                }
                catch (InputMismatchException e) {
                    // PURPOSE: Prevent crash when wrong data type is entered
                    System.out.println("Invalid input! Please enter an integer value.");
                    sc.nextLine(); // clear buffer
                }
            }
        }

        // Step 4: Print array details
        System.out.println("\nIndex\tMemory Address\t\tValue");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < n; i++) {

            // PURPOSE: identityHashCode gives a hash-like memory reference (not real memory address)
            String address = Integer.toHexString(System.identityHashCode(arr));

            System.out.println(i + "\t0x" + address + "\t\t\t\t" + arr[i]);
        }

        sc.close();
    }

}
