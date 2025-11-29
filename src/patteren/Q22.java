/*
Enter the no of n
7
1
21
321
4321
54321
654321
7654321
 */
package patteren;
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
    	int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of n");
		n = sc.nextInt();
		printPattern(n);
        sc.close();
    }
    public static void printPattern(int n) {
    		for(int i=1; i<=n; i++) {
    			for(int j =i; j>=1; j--) {
    				System.out.print(j);
    			}
    			System.out.println();
    		}
    }
}
