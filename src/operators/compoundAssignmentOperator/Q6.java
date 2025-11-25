/*
Evaluate the expression:
 int k = 3;
 k *= k += k - 1;
 System.out.println(k);
 */

package operators.compoundAssignmentOperator;
public class Q6 {
    public static void main(String[] args) {
        int k = 3;
        k *= k += k - 1;
        System.out.println(k);
    }
}
