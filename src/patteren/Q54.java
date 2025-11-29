/*
Enter the Number of Rows
5
					1
				1		2
			1		2		3
		1		2		3		4
	1		2		3		4		5
*/
package patteren;
import java.util.Scanner;
public class Q54 {
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
        for (int i=1;i<=n;i++)
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print("\t");
            }
            for (int j =1;j<=i;j++)
            {
                System.out.print(j + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
