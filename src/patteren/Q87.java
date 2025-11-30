/*
Enter the Number of Rows
5
				A
			A	B	C
		A	B	C	D	E
	A	B	C	D	E	F	G
A	B	C	D	E	F	G	H	I
*/
package patteren;
import java.util.Scanner;
public class Q87 {
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



        // MAIN NUMBER PYRAMID
        for (int i = 1; i <= n; i++) {
            int ascii = 64;  // ascii number counter
            int total = 2 * i - 1;       // numbers in the row


            // leading spaces for pyramid shape
            for (int s = 1; s <= n - i; s++) {
                System.out.print("\t");
            }

            // Character in the row
            for (int j = 1; j <= total; j++) {
                System.out.print((char)(ascii+j) + "\t");
            }
            System.out.println();
        }
    }
}
