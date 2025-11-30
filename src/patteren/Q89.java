/*
Enter the Number of Rows
5
				A
			C	B	A
		E	D	C	B	A
	G	F	E	D	C	B	A
I	H	G	F	E	D	C	B	A
*/
package patteren;
import java.util.Scanner;
public class Q89 {
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

            int total = 2 * i - 1;    // characters in the row
            int ascii = 64 + total;   // starting ASCII (A=65)
            // leading spaces for pyramid shape
            for (int s = 1; s <= n - i; s++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= total; j++) {
                System.out.print((char) ascii + "\t");
                ascii--;
            }
        System.out.println();
    }
    }
}
