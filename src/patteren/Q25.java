/* Enter the Number of Rows
 5
 15
 13 14
 10 11 12
 6 7 8 9
 1 2 3 4 5

 */

package patteren;
import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
    	int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); // ✅ closing scanner
    }
    public static void printPattern(int n)
    {
        int total = n * (n + 1) / 2;
        int start = total;

        for (int i = 1; i <= n; i++) {

            int rowStart = start - i + 1;

            for (int j = rowStart; j <= start; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
            start = rowStart - 1;
        }
    }

}


