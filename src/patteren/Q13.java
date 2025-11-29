/*
Q13: Enter the no of Rows: 
11
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * * 
*/
package patteren;

import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows: ");
        n = sc.nextInt();
        pattern(n);
        sc.close();
    }
    public static void pattern(int n) {
    	int i,j;
    	for(i = 1; i <= n; i++)
    	{
    		for(j =1; j <= i; j++)
    			System.out.print("* ");
    		System.out.println();
    	}
    	
    }
}
