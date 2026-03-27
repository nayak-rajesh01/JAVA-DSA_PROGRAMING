/*
Enter the Number of Rows
7
			D
		C		C
	B		B		B
A		A		A		A
	B		B		B
		C		C
			D
*/
package patteren;
import java.util.Scanner;
public class Q143 {
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
        int ascii = 64+mid-1; int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int j=1;j<=star;j++){
                System.out.print((char) (ascii+num) + "\t" + "\t");

            }
            if(i<mid){
                space--; star+=1; num--;
            }else{
                space++; star-=1; num++;
            }
            System.out.println();
        }
    }
}
