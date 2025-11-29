/*
Enter the number of Rows:
7
       1
      21
     321
    4321
   54321
  654321
 7654321
*/
package patteren;

import java.util.Scanner;

public class Q40 {
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
            int k =i;
            for(int j = i; j<= n; j++){
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(k +"\t");
                k--;
            }

            System.out.println();
        }
    }
}
