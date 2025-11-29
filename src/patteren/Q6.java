/*
Q6: Enter the number of Rows:
9
* * * * * * * * * 
* * * * * * * * * 
* *           * * 
* *           * * 
* *           * * 
* *           * * 
* *           * * 
* * * * * * * * * 
* * * * * * * * * 
*/
package patteren;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
    	int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        n = sc.nextInt();
        for(i =1;i<=n; i++) {
        	for(j =1; j<=n; j++) {
        		if(i==1 ||i==2||i==n-1|| i==n || j==1||j==2||j==n-1 || j==n)
             		 System.out.print("* ");
   		else
   			 System.out.print("  ");
        	}
        	System.out.println();
        }
        sc.close();
    }
}
