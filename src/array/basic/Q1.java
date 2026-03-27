/*
1. Access all even index elements from array.
*/
package array.basic;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) 
    {   Scanner sc=new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers: to store in a array.");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //call function
        printIndexElement(arr);

        sc.close(); 
    }
    public static void printIndexElement(int[] n)
    {
        for(int i=0;i<n.length;i++)
        {
            if(i%2==0)
            {
                System.out.println("Index is:" + i +  " Value:" + n[i]);
            }
        }
    }
}
