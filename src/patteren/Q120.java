/*
Enter the Number of Rows
5
	A	B	C	D	E	F	G	H	I
		A	B	C	D	E	F	G
			A	B	C	D	E
				A	B	C
					A
*/
package patteren;
import java.util.Scanner;
public class Q120 {
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
        for (int i = 1; i <(n+1); i++) {

            // row space
            for(int s = 1; s<=(n-(n-i));s++)
            {
                System.out.print("\t");
            }
            // Number of times to Left print the value
            int count = 2 * n - (2 * i - 1);
            for (int j = 1; j <= count; j++) {
                System.out.print((char)(ascii+j) + "\t");
            }
            System.out.println();
        }
    }
}
