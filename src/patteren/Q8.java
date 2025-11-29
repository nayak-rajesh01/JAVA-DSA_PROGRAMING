/*
 * imp
Q8: Enter the Rows: 
5
    *     
    *     
* * * * * 
    *     
    *   
Enter the Rows: 
4
Pattern is NOT Possible for Even Row!

*/package patteren;
import java.util.*;
public class Q8 {
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
 					if(i==mid || j==mid)
 		          		 	System.out.print("* ");
 					else
 					 	System.out.print("  ");
 		        }
 		         System.out.println();
 		      }
 		  }
 		
    
    
}
