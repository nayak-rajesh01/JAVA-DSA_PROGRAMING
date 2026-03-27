/*
Enter the Number of Rows
5
	A	B	C	D	E	D	C	B	A
		A	B	C	D	C	B	A
			A	B	C	B	A
				A	B	A
					A
*/
package patteren;
import java.util.Scanner;
public class Q126 {
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
        for (int i = 1; i < (n + 1); i++) {
            int ascii = 64;
            // row space
            for (int s = 1; s <= (n - (n - i)); s++) {
                System.out.print("\t");
            }
            // Number of times to Left print the value
            int count = 2 * n - (2 * i - 1);
            int num = 1;
            for (int j = 1; j <= (count / 2) + 1; j++) {
                System.out.print((char) (ascii+num) + "\t");
                num++;
            }
            num = num - 2;
            for (int j = 1; j <= (count / 2); j++) {
                System.out.print((char) (ascii+num) + "\t");
                num--;

            }
            System.out.println();
        }
    }
}
