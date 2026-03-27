/*
Q2: Java Program for Array Initialization, Storing Data, and
Printing Values (with Exception Handling)

==============================================================

Purpose of try–catch in this program:

- The entire array creation, data storing, and printing logic
  is wrapped inside one try block.

- If any error occurs during:
      1. Array creation
      2. Array re-assignment
      3. Index-wise data storing (in second version)
      4. Accessing or printing array values
  the catch block will handle the error.

- The catch(Exception e) ensures that the program does not crash due to:
      - ArrayIndexOutOfBoundsException
      - NullPointerException
      - Any other unexpected exception

- Instead of stopping the program abruptly, an error message
  is displayed to the user, making the program safer and user-friendly.
 */

package array.basic.mypractice;
public class Q2 {

    public static void main(String[] args) {

        try {
            int[] a = new int[5];               // declaration + size
            a = new int[]{10, 20, 30, 40, 50};  // re-assignment

            for (int i = 0; i < a.length; i++) {   // length (not length())
                System.out.println("Array Index " + i + " Value: " + a[i]);
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


    /*
    public static void main(String[] args) {

        try {
            int[] a = new int[5];   // declaration + size

            // index-wise data storing
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;
            a[4] = 50;

            // print array
            for (int i = 0; i < a.length; i++) {
                System.out.println("Array Index " + i + " Value: " + a[i]);
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

     */

}
