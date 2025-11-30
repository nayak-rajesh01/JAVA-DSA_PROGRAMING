/*
Enter the Number of Rows
5
A		A		A		A		A
	B		B		B		B
		C		C		C
			D		D
				E
*/
package patteren;
import java.util.Scanner;
public class Q100 {
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
    {   int num =15;
        for(int i = 1; i<=n;i++)
        {
            // row space
            for(int s = 1; s<(n-(n-i));s++)
            {
                System.out.print("\t");
            }
            // row printing
            int ascii = 64+i;
            for(int j =1;j<=(n-i)+1;j++)
            {
                System.out.print((char)ascii + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
