/*
Enter the Number of Rows
5
				1
			1	1	2
		3	4	1	5	6
	7	8	9	1	10	11	12
13	14	15	16	1	17	18	19	20
*/
package patteren;
import java.util.Scanner;
public class Q83 {
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

        int num = 1;  // number counter

        // MAIN NUMBER PYRAMID
        for (int i = 1; i <= n; i++) {

            int total = 2 * i - 1;       // numbers in the row
            int mid = (total + 1) / 2;   // middle position for 0

            // leading spaces for pyramid shape
            for (int s = 1; s <= n - i; s++) {
                System.out.print("\t");
            }

            // numbers in the row
            for (int j = 1; j <= total; j++) {

                if (j == mid)
                    System.out.print("1" + "\t");
                else {
                    System.out.print(num + "\t");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
