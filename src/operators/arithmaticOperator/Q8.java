/*  
 Q8
 Operator based Programming
 Find the Last Digit of a Number Without using % operator.
 n = 12345;
 Output = 5
*/

package operators.arithmaticOperator;
public class Q8 {
    public static void main(String[] args) {
    	int n = 12345;
        int lastDigit = n - (n / 10) * 10; // Without %
        System.out.println(lastDigit);
    }
}
