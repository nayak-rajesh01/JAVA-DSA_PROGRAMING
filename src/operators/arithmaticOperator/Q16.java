/*  
 Q16
 Operator based Programming
 Evaluate the Expression:
 int n = 128;
 int rev = (n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100);
*/
package operators.arithmaticOperator;
public class Q16 {
    public static void main(String[] args) {
    	int n = 128;
        int rev = (n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100);
        System.out.println(rev);
    }
}
