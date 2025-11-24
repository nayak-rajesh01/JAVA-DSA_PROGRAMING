/*  
 Q5
 Operator based Programming
 For three numbers, swap:
 1st → 2nd, 2nd → 3rd, 3rd → 1st
 a. With fourth variable
 b. Without fourth variable
*/

package operators.arithmaticOperator;
public class Q5 {
    public static void main(String[] args) {
    	int a = 1, b = 2, c = 3;

    	System.out.println("Value of a is: "+ a + " ,b is: "+ b + " ,c is: " + c);
        // With 4th variable
    	
        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("With 4th variable: a = " + a + " ,b = " + b + " ,c = " + c);

        // Without 4th variable
        a = 1; b = 2; c = 3;
        a = a + b + c; // total sum
        b = a - (b + c); // b = old a
        c = a - (b + c); // c = old b
        a = a - (b + c); // a = old c
        System.out.println("Without 4th variable: a = " + a + " ,b = " + b + " ,c = " + c);
    
    }
}
