/*
*/
package patteren;
import java.util.Scanner;
public class Q81 {
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

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            int num = n-(n-i);
            int peak = i;               // midpoint index

            for (int j = 1; j <= 2 * i - 1; j++) {

                if(j<=peak){
                    System.out.print(num + " ");
                    num++;
                }
                else {
                    num--;
                    System.out.print(num + " ");
                }

            }

            System.out.println();
        }
    }
}
