/*
Enter the Number of Rows
7
							1
						2		2
					3		3		3
				4		4		4		4
			5		5		5		5		5
		6		6		6		6		6		6
	7		7		7		7		7		7		7
*/
package patteren;
import java.util.Scanner;
public class Q52 {
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
                System.out.print(i + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
