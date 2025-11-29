package patteren;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
    	int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of n");
		n = sc.nextInt();
		printPattern(n);
    }
    public static void printPattern(int n) {
    		for(int i = n; i >=1; i--) {
    			for(int j =0 ; j <=(n-i) ; j++) {
    				System.out.print(i);
    			}
    			System.out.println();
    		}
    }
}
