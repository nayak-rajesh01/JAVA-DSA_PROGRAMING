/*
Enter the Number of Rows
7
			A
		A		B
	A		B		C
A		B		C		D
	A		B		C
		A		B
			A
*/
package patteren;
import java.util.Scanner;
public class Q141 {
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
        int star=1;	int space=n/2;	int mid=n/2+1;
        int ascii = 64;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int j=1;j<=star;j++){
                System.out.print((char) (ascii+j) + "\t" + "\t");

            }
            if(i<mid){
                space--; star+=1;
            }else{
                space++; star-=1;
            }
            System.out.println();
        }
    }
}
