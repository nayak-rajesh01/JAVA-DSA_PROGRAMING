/*  
 Q13
 Operator based Programming
 Find Sum of all even Numbers up to n Without Loop
 n = 100; Output = 2550
*/
package operators.arithmaticOperator;
public class Q13 {
    public static void main(String[] args) {
    	int n = 100;
        int k = n / 2;         // count of even numbers
        int sum = k * (k + 1); // formula
        System.out.println(sum);
    }
}
