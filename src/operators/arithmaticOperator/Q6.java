/*  
 Q6
 Operator based Programming
 For the given CP and SP. Calculate %Profit.
 CP = 120; SP = 160;
*/
package operators.arithmaticOperator;
public class Q6 {
    public static void main(String[] args) {
    	 int CP = 120, SP = 160;
         double profit = ((SP - CP) * 100.0) / CP;
         System.out.println("Profit % = " + profit);
    }
}
