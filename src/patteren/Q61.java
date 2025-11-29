/*
Enter the Number of Rows
5
					A
				B		B
			C		C		C
		D		D		D		D
	E		E		E		E		E
*/
package patteren;
import java.util.Scanner;
public class Q61 {
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
    {   int ascii =64;
        for (int i=1;i<=n;i++)
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print("\t");
            }
            for (int j =1;j<=i;j++)
            {
                System.out.print((char)(ascii+i) + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
