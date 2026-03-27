/*
Enter the Number of Rows
7
			1
		2		2
	3		3		3
4		4		4		4
	3		3		3
		2		2
			1
*/
package patteren;
import java.util.Scanner;
public class Q136 {
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
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++)
                System.out.print("\t");
            for(int j=1;j<=star;j++){
                System.out.print(num + "\t" + "\t");
            }
            if(i<mid){
                num+=1;		space--; star+=1;
            }else{
                num-=1;		space++; star-=1;
            }
            System.out.println();
        }
    }
}
