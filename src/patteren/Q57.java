/*
Enter the Number of Rows
5
					15
				14		13
			12		11		10
		9		8		7		6
	5		4		3		2		1
*/
package patteren;
import java.util.Scanner;
public class Q57 {
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
    {   int num = n*(n+1)/2;
        for (int i=1;i<=n;i++)
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print("\t");
            }
            for (int j =1;j<=i;j++)
            {
                System.out.print(num + "\t" + "\t");
                num--;
            }
            System.out.println();
        }
    }
}
