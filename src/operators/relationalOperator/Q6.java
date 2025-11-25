/*
Evaluate the expression:
 char c1 = 'A';
 char c2 = 65;
 System.out.println(c1 == c2);
 System.out.println(c1 < 'a');
 System.out.println('Z' < 'a');
*/
package operators.relationalOperator;
public class Q6 {
    public static void main(String[] args)

	 {
         char c1 = 'A';
         char c2 = 65;
         System.out.println(c1 == c2);
         System.out.println(c1 < 'a');
         System.out.println('Z' < 'a');
    }
}

/*
Error Getting:
java: bad operand types for binary operator '<'
  first type:  boolean
  second type: int
 */