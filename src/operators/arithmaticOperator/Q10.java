/*  
 Q10
 Operator based Programming
 Find Sum of three-digit number Without using Loops
 n = 123; Output = 6
*/

package operators.arithmaticOperator;
public class Q10 {
    public static void main(String[] args) {
    	int n = 123;
        int sum = (n % 10) + ((n / 10) % 10) + (n / 100);
        System.out.println(sum);
    }
}
