/*
Enter the Number of Rows
5
1		1		1		1		1
	0		0		0		0
		1		1		1
			0		0
				1
*/
package patteren;
import java.util.Scanner;
public class Q95 {
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
            for(int j =1;j<=(n-i)+1;j++)
            {
                System.out.print(i%2 + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
