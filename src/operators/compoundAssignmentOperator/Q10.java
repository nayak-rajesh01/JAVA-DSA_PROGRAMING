/*
 Evaluate the expression:
 int x = 5;
 x += x *= 2;
 System.out.println(x);
 */

package operators.compoundAssignmentOperator;
public class Q10 {
    public static void main(String[] args) {
        int x = 5;
        x += x *= 2;
        System.out.println(x);
    }
}
