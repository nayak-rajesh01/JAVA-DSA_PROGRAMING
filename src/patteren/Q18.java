/*
Enter the no of n
7
1
00
111
0000
11111
000000
1111111
 */
package patteren;
import java.util.Scanner;
public class Q18 {
	public static void main(String[] args) {
    	int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of n");
		n = sc.nextInt();
		printPattern(n);
        sc.close();
    }
    public static void printPattern(int n) {
    		for(int i =1; i <= n; i++) {
    			for(int j =1; j<=i; j++) {
    				System.out.print(i%2);
    			}
    			System.out.println();
    		}
    }
}
