package patteren;

/* imp
Enter the Rows:
11
*         * * * * * *
*         *
*         *
*         *
*         *
* * * * * * * * * * *
          *         *
          *         *
          *         *
          *         *
* * * * * *         *


*/
import java.util.*;

public class Q11 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Rows: ");
		 int n=sc.nextInt();
 		 printpattern(n);
        sc.close();
    }
    public static void printpattern(int n){
    	if(n%2==0){
    		System.out.println("Pattern is NOT Possible for Even Row!");
    		return;
    	}
    	int mid=n/2+1;
         	for(int i=1;i<=n;i++){
            	for(int j=1;j<=n;j++){
    if(i==mid || j==mid ||i==1&&j>mid ||j==n&&i>mid || i==n&&j<mid ||j==1&&i<mid)
              		 	System.out.print("* ");
    			else
    			 	System.out.print("  ");
            }
             System.out.println();
          }
      }
}
