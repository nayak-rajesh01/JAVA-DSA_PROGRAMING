/*
Evaluate the expression:
 int a, b, c;
 a = b = c = 5;
 a += b -= c *= 2;
 System.out.println(a + " " + b + " " + c);
 */

package operators.compoundAssignmentOperator;
public class Q13 {
    public static void main(String[] args) {
        int a, b, c;
        a = b = c = 5;
        a += b -= c *= 2;
        System.out.println(a + " " + b + " " + c);
    }
}
