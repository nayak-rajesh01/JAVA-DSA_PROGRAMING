/*
Enter the no of n
7
* * * * * * *
  * * * * * *
    * * * * *
      * * * *
        * * *
          * *
            *
 */
package patteren;
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
    		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of n");
		n = sc.nextInt();
		printPattern(n);
        sc.close();
    }
    public static void printPattern(int n) {
    	for (int i = 0; i < n; i++) {
            // print leading spaces (2 spaces per row offset)
            for (int s = 0; s < i * 2; s++) {
                System.out.print(" ");
            }            // print stars separated by a single space
            int stars = n - i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
                if (j < stars - 1) System.out.print(" "); // space between stars
            }
            System.out.println();
        }
    }
}
