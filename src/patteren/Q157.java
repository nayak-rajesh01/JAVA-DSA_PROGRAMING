/*
Enter the Number of Rows
7
			4
		3	3	3
	2	2	2	2	2
1	1	1	1	1	1	1
	2	2	2	2	2
		3	3	3
			4
*/
package patteren;
import java.util.Scanner;
public class Q157 {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); 
    }
    public static void printPattern(int n){
        int num = (n/2)+1;
        // upper part
        int space=n/2;	int mid=n/2+1;
        for(int i = 1; i<=mid;i++)
        {   int star = 2*i-1;
            //space area
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            space--;
            //print upper part
            for (int k =1;k<=star;k++)
            {
                System.out.print(num + "\t");
            }
            num--;
            System.out.println();
        }
        // lower part
        num = num + 2;
        for(int i = 1;i<mid;i++) {
            space = 2 * i - i;
            //space area
            for (int j = 1; j <= space; j++)
                System.out.print("\t");
            // lower part print area
            for (int k = 1; k < (n - (2 * i - 1)); k++) {
                System.out.print(num + "\t");
            }
            num++;
            System.out.println();
        }
    }
}
