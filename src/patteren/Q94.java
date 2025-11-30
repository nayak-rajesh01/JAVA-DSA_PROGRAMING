/*
Enter the Number of Rows
5
1		1		1		1		1
	2		2		2		2
		3		3		3
			4		4
				5
*/
package patteren;
import java.util.Scanner;
public class Q94 {
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
                System.out.print(i + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
