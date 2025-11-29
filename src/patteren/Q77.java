/*
Enter the Number of Rows
5
        5
      5 4 5
    5 4 3 4 5
  5 4 3 2 3 4 5
5 4 3 2 1 2 3 4 5
*/
package patteren;
import java.util.Scanner;
public class Q77 {
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

            int num = 5;
            int peak = i;               // midpoint index

            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print(num + " ");

                if (j < peak) {
                    num--;             // increase until midpoint
                } else {
                    num++;             // decrease after midpoint
                }
            }

            System.out.println();
        }
    }
}
