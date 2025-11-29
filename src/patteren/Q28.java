/*
Enter the Number of Rows
5
O
N	M
L	K	J
I	H	G	F
E	D	C	B	A
*/
package patteren;
import java.util.Scanner;
public class Q28 {
    public static void main(String[] args)
	 {
         int n;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number of Rows");
         n = sc.nextInt();
         printPattern(n);
         sc.close(); //
    }
    public static void printPattern(int n)
    {   int num = (n*(n+1))/2;
        int ascii = 64 + num;

        for (int i=1; i<= n; i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print((char)ascii + "\t");
                ascii--;
            }
            System.out.println();
        }

    }

}
