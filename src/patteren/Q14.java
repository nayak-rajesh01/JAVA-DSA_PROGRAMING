/*
 Enter the no of Rows
7
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/
package patteren;
import java.util.*;
public class Q14 {

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
		int i,j;
		for(i=n; i>=1; i--) {
			for(j=i; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
