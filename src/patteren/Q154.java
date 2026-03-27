/*
Enter the Number of Rows
7
						1
					3	2	1
				5	4	3	2	1
			7	6	5	4	3	2	1
				5	4	3	2	1
					3	2	1
						1
*/
package patteren;
import java.util.Scanner;
public class Q154 {
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

        // TOP HALF
        for (int i = 1; i <= n/2+1; i++) {

            // leading spaces
            for (int s = 1; s <= n - i; s++)
                System.out.print("\t");

            int start = 2 * i - 1;  // odd number start

            // decreasing numbers
            for (int j = start; j >= 1; j--)
                System.out.print(j + "\t");

            System.out.println();
        }

        // BOTTOM HALF
        for (int i = n/2; i >= 1; i--) {

            // leading spaces
            for (int s = 1; s <= n - i; s++)
                System.out.print("\t");

            int start = 2 * i - 1;

            for (int j = start; j >= 1; j--)
                System.out.print(j + "\t");

            System.out.println();
        }
    }
}
