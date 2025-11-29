/*
Q3: Enter the number of Rows:
5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
*/
package patteren;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        n = sc.nextInt();
        for(i =1;i<=n; i++) {
        	for(j =1; j<=n; j++) {
        		System.out.print(" " + j);
        	}
        	System.out.println();
        }
        sc.close();
    }
}
