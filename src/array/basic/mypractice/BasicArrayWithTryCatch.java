/*
Q1> Basic Array implementation with try catch
*/
package array.basic.mypractice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicArrayWithTryCatch {
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

                System.out.println(i + "\t0x" + address + "\t\t" + arr[i]);
            }

            sc.close();
    }
}
