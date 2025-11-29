/*

 */
package patteren;
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
    	int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of n");
		n = sc.nextInt();
		printPattern(n);
		sc.close();
    }
    public static void printPattern(int n) {
    	for(int i = 1; i<=n; i++) {
    		for(int j = 1; j<=i; j++) {
    			System.out.print(j + " ");
    		}
    		System.out.println();
    	}
    }
}
