/*  
 Q12
 Operator based Programming
 Find Sum of all odd Numbers up to n Without Loop
 n = 100; Output = 2500
*/

package operators.arithmaticOperator;
public class Q12 {
    public static void main(String[] args) {
    	int n = 100;
        int k = (n + 1) / 2; // count of odd numbers
        int sum = k * k;     // formula
        System.out.println(sum);
    }
}
