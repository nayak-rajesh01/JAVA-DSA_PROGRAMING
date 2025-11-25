/*
 int a = 5, b = 3;
 a += b *= 2;
 System.out.println(a + " " + b);
 */

package operators.compoundAssignmentOperator;
public class Q17 {
    public static void main(String[] args)
    {
        int a = 5, b = 3;
        a += b *= 2;
        System.out.println(a + " " + b); // 11 6
    }
}
