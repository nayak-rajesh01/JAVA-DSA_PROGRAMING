/*
Enter the Number of Rows
5
A		B		C		D		E
	A		B		C		D
		A		B		C
			A		B
				A
*/
package patteren;
import java.util.Scanner;
public class Q101 {
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
        for(int i = 1; i<=n;i++)
        {
            // row space
            for(int s = 1; s<(n-(n-i));s++)
            {
                System.out.print("\t");
            }
            // row printing
            int ascii = 64;
            for(int j =1;j<=(n-i)+1;j++)
            {
                System.out.print((char)(ascii+j) + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
