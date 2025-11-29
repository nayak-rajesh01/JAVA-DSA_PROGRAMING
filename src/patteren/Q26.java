/*Q:26
Enter the number of Rows:
3
6
5 4
3 2 1
 */
package patteren;
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
    	int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); // ✅ closing scanner
    }
    public static void printPattern(int n) {
    		int i,j,num;
    		num = (n*(n+1)/2);
    		for(i=1;i<=n;i++) {
    			for(j=1;j<=i;j++) {
    				System.out.print(num + " ");
    				num-=1;
    			}
    			System.out.println();
    		}
    		
    }
}
