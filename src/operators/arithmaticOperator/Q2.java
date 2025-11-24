/*  
 Q2
 Operator based Programming
 For a given number int n = 5783;
 a. Print the last digit of the number
 b. Print the last two digits of the number
 c. Remove the last digit of the number
 d. Remove the last two digits of the number
*/

package operators.arithmaticOperator;

public class Q2 {

	public static void main(String[] args) {
		int n = 5783;
		System.out.println(n % 10);
		System.out.println(n % 100);
		System.out.println(n / 10);
		System.out.println(n / 100);
	}

}
