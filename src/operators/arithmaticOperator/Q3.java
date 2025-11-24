/*  
 Q3
 Operator based Programming
 For a given number int n = 5783;
 Print each digit of the number one by one.
 o/p:
 3
 8
 7
 5
*/
package operators.arithmaticOperator;
class Q3 {
    public static void main(String[] args) {
        int n = 5783;
        System.out.println(n % 10);
        n = n / 10;
        System.out.println(n % 10);
        n = n / 10;
        System.out.println(n % 10);
        n = n / 10;
        System.out.println(n % 10);
        n = n / 10;
        
    }
}
