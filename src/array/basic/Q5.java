/*
5. print and count all three-digit numbers from array.
*/
package array.basic;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 10 numbers: to store in a array.");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //call function

        sc.close();
    }
    public static void threeDigitCountPrint(int n)
    {
    }
}
