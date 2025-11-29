/*
Enter the number of Rows:
5
A
B	B
C	C	C
D	D	D	D
E	E	E	E	E
*/
package patteren;

import java.util.Scanner;

public class Q29 {
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

        for(int i =1 ; i <= n; i++){
            int ascii = 64;
            ascii = ascii+i;
            for(int j = 1; j<= i; j++)
            {
                System.out.print((char)ascii + "\t");
            }
            System.out.println();
        }
    }
}
