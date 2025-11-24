/*  
 Q14
 Operator based Programming
 Find Sum of squares of all Numbers up to n Without Loop
 n = 100; Output = 338350
*/
package operators.arithmaticOperator;
public class Q14 {
    public static void main(String[] args) {
    	int n = 100;
        int sum = (n * (n + 1) * (2 * n + 1)) / 6; // formula
        System.out.println(sum);
    }
}
