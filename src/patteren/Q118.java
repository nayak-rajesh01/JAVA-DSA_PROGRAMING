/*
Enter the Number of Rows
5
5	4	3	2	1	2	3	4	5
	4	3	2	1	2	3	4
		3	2	1	2	3
			2	1	2
				1
*/
package patteren;
import java.util.Scanner;
public class Q118 {
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

        for (int i = n; i >= 1; i--) {

            // leading spaces
            for (int s = 0; s < (n - i); s++) {
                System.out.print("\t");
            }

            // decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "\t");
            }

            // increasing numbers (start from 2)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + "\t");
            }

            System.out.println();
        }
    }
}
