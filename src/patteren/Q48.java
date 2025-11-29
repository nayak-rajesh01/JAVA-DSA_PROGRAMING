/*
Enter the Number of Rows
5
					A
				B	A
			C	B	A
		D	C	B	A
	E	D	C	B	A
*/
package patteren;
import java.util.Scanner;
public class Q48 {
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

        for(int i = 1; i<= n; i++) {
            int ascii =64 + i;
            for (int j = i; j <= n; j++) {
                System.out.print("\t");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print((char)ascii + "\t");
                ascii--;
            }

            System.out.println();
        }
    }
}
