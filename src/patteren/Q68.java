/*
Enter the Number of Rows
5
						1
					2	2	2
				3	3	3	3	3
			4	4	4	4	4	4	4
		5	5	5	5	5	5	5	5	5
*/
package patteren;
import java.util.Scanner;
public class Q68 {
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
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print("\t");
            }
            for (int j =1;j<=((2*i)+1);j++)
            {
                System.out.print(i+1 + "\t");
            }
            System.out.println();
        }
    }
}
