/*
Enter the Number of Rows
5
					E
				D	D
			C	C	C
		B	B	B	B
	A	A	A	A	A
*/
package patteren;
import java.util.Scanner;
public class Q47 {
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
        int ascii =64 + n;
        for(int i = 1; i<= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("\t");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print((char)ascii + "\t");
            }
            ascii--;
            System.out.println();
        }
    }
}
