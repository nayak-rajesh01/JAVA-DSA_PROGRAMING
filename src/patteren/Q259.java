//Q: 259: Pascal Triangle
/*
Enter the Number of Rows:
3
1
1	1
1	2	1
 */

package patteren;

import java.util.Scanner;

public class Q259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int row = sc.nextInt();
        printPattern(row);
        sc.close();
    }

    public static void printPattern(int n)
    {   int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                if (j ==0 || j == i) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + "\t");
                } else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();


        }
    }
}
