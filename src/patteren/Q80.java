/*
Enter the Number of Rows
5

        0
      1 0 1
    2 1 0 1 2
  3 2 1 0 1 2 3
4 3 2 1 0 1 2 3 4
*/
package patteren;
import java.util.Scanner;
public class Q80 {
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

        for (int i = 0; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            int num = i;
            int peak = i;               // midpoint index

            for (int j = 1; j <= 2 * i - 1; j++) {
                if(j<=peak){
                    num--;
                }
                else {
                    num++;
                }
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
