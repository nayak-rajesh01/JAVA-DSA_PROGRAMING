/*  
 Q11
 Operator based Programming
 Find Sum of First N Natural Numbers Without Loop
 n = 100; Output = 5050
*/

package operators.arithmaticOperator;
public class Q11 {
    public static void main(String[] args) {
    	int n = 100;
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }
}
