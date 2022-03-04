/**1. Write a program that demonstrates exception handling mechanism.
(a) Arithmetic exception
(b) Array out of index exception
(c ) File not found exception**/

import java.util.*;

class Cycle_6_qn_1_a
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number:");
        int x=obj.nextInt();
        System.out.println("Entered value is :"+x);
        try
        {
            int y=x/0;
            System.out.println("after division"+y);
        } 
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
