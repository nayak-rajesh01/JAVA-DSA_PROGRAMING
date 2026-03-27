/*
Q2. Access all even elements from array.
*/
package array.basic;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers: to store in a array.");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //call function
        printEvenElement(arr);

        sc.close();
    }
    public static void printEvenElement(int[] n)
    {   int count=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0)
                System.out.println("Index Element:" + i +" Even Value "+ n[i]);
        }
    }
}
