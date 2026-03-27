/*
Enter the Number of Rows
7
			16
		15		14
	13		12		11
10		9		8		7
	6		5		4
		3		2
			1
*/
package patteren;
import java.util.Scanner;
public class Q135 {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); 
    }
    public static void printPattern(int n){
        int star = 1;
        int space = n / 2;
        int mid = (n / 2) + 1;

        // Step 1: Calculate total numbers in diamond
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= mid)
                total += i;          // 1,2,3,4
            else
                total += (n - i + 1); // 3,2,1
        }

        int num = total;  // should be 16 for n=7

        // Step 2: print reverse pattern
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= space; j++)
                System.out.print("\t");

            // stars (numbers)
            for (int j = 1; j <= star; j++) {
                System.out.print(num + "\t" + "\t");
                num--;
            }

            // adjust star & space
            if (i < mid) {
                star++; space--;
            } else {
                star--; space++;
            }

            System.out.println();
        }
    }
}
