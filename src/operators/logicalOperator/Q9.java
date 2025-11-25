/*
 For a given year print true if it is a leap year or
print false if it is not a leap year.
Hackerrank Link: https://www.hackerrank.com/challenges/write-a-function/problem
 */
package operators.logicalOperator;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("This is Q9.java");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println(isLeap(year));
    }

    public static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}

