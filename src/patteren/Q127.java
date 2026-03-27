/*
Enter the Number of Rows
5
*
*	*
*	*	*
*	*	*	*
*	*	*	*	*
*	*	*	*
*	*	*
*	*
*
*/
package patteren;
import java.util.Scanner;
public class Q127 {
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
    {   int num = 5;
        int count = (n * 2) - 1;
        for(int i = 1; i<=(count/2)+1;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        for (int k=1;k<=(count/2);k++)
        {
            for (int j = num; j >1; j--) {
                System.out.print("*" + "\t");
            }
            System.out.println();
            num--;
        }
    }
}
