/*
Q1: Java Program for Simple Array Declaration, Initialization, and Printing Using Try-Catch

=============================================================================

Purpose of try–catch in this program:

- The entire array declaration, initialization, and printing logic
  is wrapped inside one try block.

- catch(Exception e) is used to handle any unexpected errors such as:
      - ArrayIndexOutOfBoundsException (if an invalid index is accessed)
      - NullPointerException (if array reference becomes null)
      - Any other runtime exception

- This prevents the program from crashing and instead shows a clean,
  user-friendly error message.

- Even though this program is simple and unlikely to throw errors,
  try–catch is added to demonstrate safe coding and exception handling.
*/
package array.basic.mypractice;
public class Q1 {
    public static void main(String[] args) {
        try {
            int[] a;               // declaration but not mention size
            a = new int[]{10, 20, 30, 40, 50};  // re-assignment

            for (int i = 0; i < a.length; i++) {   // length (not length())
                System.out.println("Array Index " + i + " Value: " + a[i]);
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
