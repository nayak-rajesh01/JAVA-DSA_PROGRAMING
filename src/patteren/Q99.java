/*
Enter the Number of Rows
5
15		14		13		12		11
	10		9		8		7
		6		5		4
			3		2
				1
*/
package patteren;
import java.util.Scanner;
public class Q99 {
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
            for(int j =1;j<=(n-i)+1;j++)
            {
                System.out.print(num + "\t" + "\t");
                num--;
            }
            System.out.println();
        }
    }
}
