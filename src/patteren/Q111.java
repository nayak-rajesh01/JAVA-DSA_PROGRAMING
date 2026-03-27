/*
Enter the Number of Rows
5
	1	2	3	4	5	6	7	8	9
		10	11	12	13	14	15	16
			17	18	19	20	21
				22	23	24
					25
*/
package patteren;
import java.util.Scanner;
public class Q111 {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); 
    }
    public static void printPattern(int n) {
        int num = 1;
        for (int i = 1; i <=(n+1); i++) {

            // row space
            for(int s = 1; s<=(n-(n-i));s++)
            {
                System.out.print("\t");
            }
            // Number of times to print the value
            int count = 2 * n - (2 * i - 1);
            for (int j = 1; j <= count; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }
}
