/*
Enter the number of Rows:
7
       1
      12
     123
    1234
   12345
  123456
 1234567
*/
package patteren;

import java.util.Scanner;

public class Q35 {
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
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
