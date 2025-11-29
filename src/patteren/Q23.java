/*
Enter the Number of Rows
5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
package patteren;
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
    public static void printPattern(int n) {
    			int sum =0;
    		for(int i = 1; i <= (n+1); i++) {
    			for(int j =1; j < i; j++) {
    				System.out.print(sum = sum + 1);
    				System.out.print(" ");
    			}
    			System.out.println();	
    		}
    }
}
