/*
Enter the Number of Rows
5
				*
			*	*
		*	*	*
	*	*	*	*
*	*	*	*	*
*	*	*	*	*
	*	*	*	*
		*	*	*
			*	*
				*
*/
package patteren;
import java.util.Scanner;
public class Q128 {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); 
    }
    public static void printPattern(int n)
    {
        int count = (n * 2) - 1;
        // up to n
        for(int i =1 ;i<=(count/2)+1;i++){
            // row space
            for(int s = 1; s<(n-i)+1;s++)
            {
                System.out.print("\t");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        // up to (n-1)
        for(int i =1 ;i<=(count/2)+1;i++){
            // row space
            for(int s = 1; s<(n-(n-i));s++)
            {
                System.out.print("\t");
            }
            for(int j = n;j>=i;j--){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
}
