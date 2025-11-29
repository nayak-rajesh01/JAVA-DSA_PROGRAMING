/*
Enter the number of Rows:
7
       1
      10
     101
    1010
   10101
  101010
 1010101
*/
package patteren;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); // ✅ closing scanner
    }
    public static void printPattern(int n)
    {
        for(int i = 1; i <= n; i++){
            for(int j = i; j<= n; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j%2);
            }
            System.out.println();
        }
    }
}
