/**2. Write program that creates a user defined exception when the balance in an account is less than
500**/

import java.util.*;

class Cycle_6_qn_2
{
    static void checkbalance(int x)
    {
        if(x<500)
        {
            throw new ArithmeticException ("Balance is not sufficient");
        }
        else
        {
            System.out.println("You can proceed");
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter account balance:");
        int b = obj.nextInt();
        checkbalance(b);
    }
}
