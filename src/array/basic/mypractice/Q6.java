/*
Q6: Advanced Menu-Driven Array Application in Java Using Exception Handling and Dynamic Resizing

=============================================================================================

PURPOSE OF TRY–CATCH IN THIS ADVANCED ARRAY APPLICATION

This program uses try–catch and validation loops to prevent all runtime errors
and ensure smooth user input handling.

1. Safe Integer Input (getIntInput method)
   - nextInt() can throw InputMismatchException when user enters:
         • alphabets (a, b, z)
         • symbols (@, #, $)
         • decimals (3.14)
   - try–catch handles this and prevents the program from crashing.
   - User is asked again until a correct integer is entered.

2. Array Size Validation
   - Prevents negative size or zero size.
   - Ensures the array is always valid before use.

3. Insert Operation
   - try–catch prevents invalid inputs while inserting new values.
   - Allows dynamic resizing by creating a new array safely.

4. Update Operation
   - Index may be invalid (negative or greater than size).
   - Validation + try–catch avoids ArrayIndexOutOfBoundsException.

5. Delete Operation
   - Safe deletion only happens when index is valid.
   - Prevents exceptions during shifting or copying.

6. Search Operation
   - Fully protected integer input for search value.

7. Display Operation
   - identityHashCode() used safely for showing memory-like reference.

Overall Purpose:
   ✔ Protect entire program from wrong inputs
   ✔ Prevent all InputMismatch and index-based exceptions
   ✔ Allow the program to run continuously without crashing
   ✔ Provide a professional, user-friendly menu experience
   ✔ Make array operations safe, clean, and robust
 */
package array.basic.mypractice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {

    static Scanner sc = new Scanner(System.in);
    static int[] arr = null;   // dynamic array
    static int size=0;       // current used size

    public static void main(String[] args) {

        System.out.println("===== ADVANCED ARRAY APPLICATION =====");

        createArray();  // Step 1: Create array safely

        int choice;
        do {
            showMenu();
            choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1: insertValue(); break;
                case 2: updateValue(); break;
                case 3: deleteValue(); break;
                case 4: searchValue(); break;
                case 5: displayArray(); break;
                case 0: System.out.println("Exiting... Thank you!"); break;
                default: System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);
    }

    // ---------------- MENU ----------------
    static void showMenu() {
        System.out.println("\n========= MENU =========");
        System.out.println("1. Insert Value");
        System.out.println("2. Update Value");
        System.out.println("3. Delete Value");
        System.out.println("4. Search Value");
        System.out.println("5. Display Array");
        System.out.println("0. Exit");
        System.out.println("=========================");
    }


    // ---------------- SAFE INPUT METHOD ----------------
    static int getIntInput(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return sc.nextInt();   // may throw InputMismatchException
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter an integer only.");
                sc.nextLine(); // clear buffer
            }
        }
    }


    // ---------------- CREATE ARRAY ----------------
    static void createArray() {
        int n;
        while (true) {
            n = getIntInput("Enter initial array size: ");
            if (n > 0) break;
            System.out.println("Size must be positive.");
        }

        arr = new int[n];
        size = n;

        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            arr[i] = getIntInput("Value at index " + i + ": ");
        }
    }


    // ---------------- INSERT VALUE ----------------
    static void insertValue() {
        int newValue = getIntInput("Enter value to insert: ");

        // Increase array size by 1
        int[] newArr = new int[size + 1];

        // Copy old data
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        // Add new value
        newArr[size] = newValue;

        arr = newArr;
        size++;

        System.out.println("Value inserted successfully!");
    }


    // ---------------- UPDATE VALUE ----------------
    static void updateValue() {
        int index = getIntInput("Enter index to update: ");

        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        int newValue = getIntInput("Enter new value: ");
        arr[index] = newValue;

        System.out.println("Value updated successfully!");
    }


    // ---------------- DELETE VALUE ----------------
    static void deleteValue() {
        int index = getIntInput("Enter index to delete: ");

        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        // Create new array with size-1
        int[] newArr = new int[size - 1];
        int j = 0;

        for (int i = 0; i < size; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        arr = newArr;
        size--;

        System.out.println("Value deleted successfully!");
    }


    // ---------------- SEARCH VALUE ----------------
    static void searchValue() {
        int value = getIntInput("Enter value to search: ");

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.println("Value found at index: " + i);
                return;
            }
        }
        System.out.println("Value not found in array.");
    }


    // ---------------- DISPLAY ARRAY ----------------
    static void displayArray() {
        System.out.println("\nIndex\tMemory Address\t\tValue");
        System.out.println("-------------------------------------");

        for (int i = 0; i < size; i++) {
            String address = Integer.toHexString(System.identityHashCode(arr));
            System.out.println(i + "\t0x" + address + "\t\t" + arr[i]);
        }
    }
}
