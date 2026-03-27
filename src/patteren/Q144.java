/*
Enter the Number of Rows
7
			A
		B		C
	D		E		F
G		H		I		J
	K		L		M
		N		O
			P
*/
package patteren;
import java.util.Scanner;
public class Q144 {
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
        int ascii = 64; int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int j=1;j<=star;j++){
                System.out.print((char) (ascii+num) + "\t" + "\t");
                num++;
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
