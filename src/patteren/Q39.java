/*
Enter the number of Rows:
7
							7
						6	6
					5	5	5
				4	4	4	4
			3	3	3	3	3
		2	2	2	2	2	2
	1	1	1	1	1	1	1
*/
package patteren;

import java.util.Scanner;

public class Q39 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        n = sc.nextInt();
        printPattern(n);
        sc.close(); // ✅ closing scanner
    }
    public static void printPattern(int n)
    {   int k =n;
        for(int i = 1; i <= n; i++){
            for(int j = i; j<= n; j++){
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(k + "\t");
            }
            k--;
            System.out.println();
        }
    }
}
