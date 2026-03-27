/*
3. count all even elements from array.
*/
package array.basic;
import java.util.Scanner;
public class Q3 {
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
        int countEvenElement = countEvenElement(arr);
        System.out.println("Number of even elements: "+countEvenElement);
        sc.close();
    }
    public static int countEvenElement(int[] n)
    {   int count=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0)
            {
                System.out.println("Index Element:" + i +" Even Value "+ n[i]);
                count++;
            }
        }
        return count;
    }
}
