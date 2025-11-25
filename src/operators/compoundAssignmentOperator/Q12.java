/*
Evaluate the expression:
 int n = 4;
 n *= n += 2;
 System.out.println(n);
 */

package operators.compoundAssignmentOperator;
public class Q12 {
    public static void main(String[] args) {
        int n = 4;
        n *= n += 2;
        System.out.println(n);
    }
}
