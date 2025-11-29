/*
Enter the Number of Rows
5
					O
				M	N
			J	K	L
		F	G	H	I
	A	B	C	D	E
*/
package patteren;
import java.util.Scanner;
public class Q50 {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); 
    }
    public static void printPattern(int n) 
    {
        int total = n * (n + 1) / 2;
        int start = total;

        for (int i = 1; i <= n; i++) {

            int rowStart = start - i + 1;
            for (int j =i;j<=n;j++)
            {
                System.out.print("\t");
            }
            for (int j = rowStart; j <= start; j++) {
                System.out.print((char)(j+64)  + "\t");
            }

            System.out.println();
            start = rowStart - 1;
        }
    }
}
