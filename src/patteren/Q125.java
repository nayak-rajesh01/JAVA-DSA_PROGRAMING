/*
Enter the Number of Rows
5
E	D	C	B	A	B	C	D	E
	D	C	B	A	B	C	D
		C	B	A	B	C
			B	A	B
				A
*/
package patteren;
import java.util.Scanner;
public class Q125 {
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
        int ascii = 64;
        for (int i = n; i >= 1; i--) {

            // leading spaces
            for (int s = 0; s < (n - i); s++) {
                System.out.print("\t");
            }

            // decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print((char)(ascii+j) + "\t");
            }

            // increasing numbers (start from 2)
            for (int j = 2; j <= i; j++) {
                System.out.print((char) (ascii+j) + "\t");
            }
            System.out.println();
        }
    }
}
