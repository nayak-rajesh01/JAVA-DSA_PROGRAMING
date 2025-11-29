/*
Enter the Number of Rows
5
					1
				3	2
			6	5	4
		10	9	8	7
	15	14	13	12	11
*/
package patteren;
import java.util.Scanner;
public class Q41 {
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
        for(int i = 1; i<= n; i++){
                int num = i*(i+1)/2;
            for (int j =i ; j<=n;j++)
            {
                System.out.print("\t");
            }
            for (int j =1 ; j<=i;j++)
            {
                System.out.print(num + "\t");
                num--;
            }
            System.out.println();
        }
    }
}
