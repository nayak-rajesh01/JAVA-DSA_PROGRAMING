/*
Enter the number of Rows:
5
A
A	B
A	B	C
A	B	C	D
A	B	C	D	E
*/
package patteren;

import java.util.Scanner;

public class Q30 {
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

        for(int i =1 ; i <=n;i++){
            int ascii = 65;
            for(int j = 1; j<=i; j++)
            {
                System.out.print((char)ascii + "\t");
                ascii++;
            }
            System.out.println();
        }
     }
}
