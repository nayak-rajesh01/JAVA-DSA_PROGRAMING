/*
Enter the Number of Rows
5
						1
					3	2	1
				5	4	3	2	1
			7	6	5	4	3	2	1
		9	8	7	6	5	4	3	2	1
*/
package patteren;
import java.util.Scanner;
public class Q73 {
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
            int num = (2*i)+1;
            for (int j =1;j<=((2*i)+1);j++)
            {
                System.out.print( num + "\t");
                num--;
            }

            System.out.println();
        }
    }
}
