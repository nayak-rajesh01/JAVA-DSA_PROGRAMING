/*
Q4. Access all elements of array from end.
*/
package array.basic;
import java.util.Scanner;
public class Q4 {
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
        printFromEnd(arr);
        sc.close();
    }
    public static void printFromEnd(int[] n)
    {
        int length=n.length;
        for(int i=(length-1);i>=0;i--)
        {
            System.out.println("Index number is: "+ i + " Element is: "+ n[i]);
        }
    }
}
