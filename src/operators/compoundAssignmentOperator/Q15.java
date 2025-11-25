/*
 Evaluate the expression:
 int a = 2, b = 3, c = 4;
 a += b += c *= 2;
 System.out.println(a + " " + b + " " + c);
 */
package operators.compoundAssignmentOperator;
public class Q15 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        a += b += c *= 2;
        System.out.println(a + " " + b + " " + c);
    }
}
