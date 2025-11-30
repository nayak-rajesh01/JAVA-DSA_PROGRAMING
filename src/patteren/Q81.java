/*
Enter the Number of Rows
5
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
package patteren;
import java.util.Scanner;
public class Q81 {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); 
    }
    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            // PRINT increasing numbers
            for (int j = i; j < i + i; j++) {
                System.out.print(j + " ");
            }
            // PRINT decreasing numbers
            for (int j = i + i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
