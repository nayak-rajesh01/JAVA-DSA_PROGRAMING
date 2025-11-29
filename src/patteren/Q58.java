/*
Enter the Number of Rows
5
					1
				2		1
			3		2		1
		4		3		2		1
	5		4		3		2		1
*/
package patteren;
import java.util.Scanner;
public class Q58 {
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
        {   int num = i;
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
