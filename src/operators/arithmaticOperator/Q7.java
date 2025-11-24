/*  
 Q7
 Operator based Programming
 For the given CP and SP. Calculate %Loss.
 CP = 120; SP = 90;
*/

package operators.arithmaticOperator;
public class Q7 {
    public static void main(String[] args) {
    	 int CP = 120, SP = 90;
         double loss = ((CP - SP) * 100.0) / CP;
         System.out.println("Loss % = " + loss);
    }
}
