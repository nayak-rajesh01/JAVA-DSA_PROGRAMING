/*
Enter the number of Rows:
7
                     1
                  2 3
               4 5 6
            7 8 9 10
      11 12 13 14 15
    16 17 18 19 20 21
  22 23 24 25 26 27 28
*/
package patteren;

import java.util.Scanner;

public class Q37 {
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
    {   int k =1;
        for(int i = 1; i <= n; i++){
            for(int j = i; j<= n; j++){
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(k + "\t");
                k++;
            }
            System.out.println();
        }
    }
}
