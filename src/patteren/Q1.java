/*Q:1
Enter the number of Rows: 
5
11111
22222
33333
44444
55555
*/
package patteren;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        n = sc.nextInt();
        for(i =1 ; i <= 5; i++)
        {
        	for(j = 1; j <= 5; j++) {
        		System.out.print(" " + i);
        	}
        	System.out.println();
        }
        sc.close();
    }
}
