/*
Enter the Number of Rows
5
				Y
			X	W	V
		U	T	S	R	Q
	P	O	N	M	L	K	J
I	H	G	F	E	D	C	B	A
*/
package patteren;
import java.util.Scanner;
public class Q85 {
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

        int ascii = 91 -(91 -(64 + (n*n)));  // ascii number counter

        // MAIN NUMBER PYRAMID
        for (int i = 1; i <= n; i++) {

            int total = 2 * i - 1;       // numbers in the row


            // leading spaces for pyramid shape
            for (int s = 1; s <= n - i; s++) {
                System.out.print("\t");
            }

            // Character in the row
            for (int j = 1; j <= total; j++) {
                System.out.print((char) ascii + "\t");
                ascii--;
            }
            System.out.println();
        }
    }
}
