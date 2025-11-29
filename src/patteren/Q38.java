/*
Enter the number of Rows:
7

*/
package patteren;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); // ✅ closing scanner
    }

    public static void printPattern(int n) {
         int num = n*(n+1)/2;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("\t");
            }
            for(int j =1; j<= i; j++)
            {
                System.out.print(num + "\t");
                num--;
            }
            System.out.println();
        }
    }
}
