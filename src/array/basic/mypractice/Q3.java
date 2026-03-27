/*
Q3: Java Program to Initialize an Array with User Input Using a Single Try-Catch Block

======================================================================================

- The entire code is written inside one main try block.
- This means any error that occurs in the following steps will be caught:
   1. Taking array size (if input is invalid)
   2. Creating the array (if size is negative)
   3. Taking array values (if non-integer input is given)
   4. Printing array details

- The catch(Exception e) block handles ALL possible exceptions.
- This prevents the program from crashing and instead prints a friendly error message.
- Using general Exception e catches any type of runtime error.
 */

package array.basic.mypractice;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            // Step 1: Take array size
            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] arr;

            // Step 2: Create array
            arr = new int[n];

            // Step 3: Take array values
            System.out.println("Enter " + n + " values:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Step 4: Print array details
            System.out.println("\nIndex\tMemory Address\t\tValue");
            System.out.println("--------------------------------------------");

            for (int i = 0; i < n; i++) {
                // identityHashCode prints memory-like hash (JVM internal reference)
                String address = Integer.toHexString(System.identityHashCode(arr));

                System.out.println(i + "\t0x" + address + "\t\t\t\t" + arr[i]);
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
