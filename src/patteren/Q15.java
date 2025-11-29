/*
Enter the no of Rows
7
      *
     **
    ***
   ****
  *****
 ******
*******
 */

package patteren;
import java.util.Scanner;
public class Q15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the no of Rows");
				n = sc.nextInt();
				printPattern(n);
        sc.close();
	}
	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
	        // print spaces
	        for (int j = i; j < n; j++) {
	            System.out.print(" ");
	        }
	        // print stars
	        for (int k = 1; k <= (i); k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
