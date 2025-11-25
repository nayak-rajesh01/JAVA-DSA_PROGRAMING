/*
Q1:
Evaluate the expression:
 Int a=8, b=4, c=2;
 a+=(a+b-c)/2;
 System.out.println(a);
 */
package operators.compoundAssignmentOperator;
public class Q1 {
    public static void main(String[] args) {
        int a=8;
        int b=4;
        int c=2;
        a+=(a+b-c)/2;
        System.out.println(a);
    }
}
