/*  
 Q4
 Operator based Programming
 WAJP to swap two numbers.
 a. With using a third variable
 b. Without using a third variable
*/
package operators.arithmaticOperator;
public class Q4 {
    public static void main(String[] args) {
    	 int a = 10, b = 20;
    	 System.out.println("Before value of a is: "+ a +" b is: "+ b);
         // With third variable
    	 
         int temp = a;
         a = b;
         b = temp;
         System.out.println("With 3rd variable: a = " + a + " b = " + b);

         // Without third variable
    
         a = a + b;
         b = a - b;
         a = a - b;
         System.out.println("Without 3rd variable: a = " + a + " b = " + b);
    }
}
