/*
Evaluate the expression:
 int n = 14;
 n += n % 5 * 2;
 System.out.println(n);
 */

package operators.compoundAssignmentOperator;
public class Q7 {
    public static void main(String[] args) {
        int n = 14;
        n += n % 5 * 2;
        System.out.println(n);
    }
}
