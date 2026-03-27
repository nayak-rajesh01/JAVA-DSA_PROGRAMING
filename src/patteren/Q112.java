/*
Enter the Number of Rows
5
	25	24	23	22	21	20	19	18	17
		16	15	14	13	12	11	10
			9	8	7	6	5
				4	3	2
					1
*/
package patteren;
import java.util.Scanner;
public class Q112 {
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
        int num = n*n;
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
                num--;
            }
            System.out.println();
        }
    }
}
