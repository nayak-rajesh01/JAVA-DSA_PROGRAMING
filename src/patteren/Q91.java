/*
Enter the Number of Rows
5
				A
			B	C	B
		C	D	E	D	C
	D	E	F	G	F	E	D
E	F	G	H	I	H	G	F	E
*/
package patteren;
import java.util.Scanner;
public class Q91 {
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
            // leading spaces for pyramid shape
            for (int s = 1; s <= n - i; s++) {
                System.out.print("\t");
            }
            int ascii = 64+i;
            // LEFT side: A B C ... (i characters)
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(ascii) + "\t");
                ascii++;
            }

            ascii -= 2; // step back one letter for right side

            // RIGHT side: ... C B A
            for (int j = 1; j < i; j++) {
                System.out.print((char)(ascii) + "\t");
                ascii--;
            }
            System.out.println();
        }
    }
}
