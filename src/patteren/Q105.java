/*
Enter the Number of Rows
5
E		D		C		B		A
	D		C		B		A
		C		B		A
			B		A
				A
*/
package patteren;
import java.util.Scanner;
public class Q105 {
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
        for(int i = 0; i<n;i++)
        {
            // row space
            for(int s = 1; s<(n-(n-i)+1);s++)
            {
                System.out.print("\t");
            }
            // row printing
            int ascii =64+(n-i);
            for(int j =1;j<=(n-i);j++)
            {
                System.out.print((char)ascii + "\t" + "\t");
                ascii--;
            }

            System.out.println();
        }
    }
}
