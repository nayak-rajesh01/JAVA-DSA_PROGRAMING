/*
Q2: 
Enter the number of Rows:
5
 1 1 1 1 1
 0 0 0 0 0
 1 1 1 1 1
 0 0 0 0 0
 1 1 1 1 1
*/
package patteren;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
    	int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        n = sc.nextInt();
        for(i =1;i<=n; i++) {
        	for(j =1; j<=n; j++) {
        		System.out.print(" " + i%2);
        	}
        	System.out.println();
        }
        sc.close();
    }
}
