/*  
 Q9
 Operator based Programming
 Reverse a 3-Digit Number Using Arithmetic operators.
 n = 123; Output = 321
*/

package operators.arithmaticOperator;
public class Q9 {
    public static void main(String[] args) {
    	 int n = 123;
         int rev = (n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100);
         System.out.println(rev);
    }
}
