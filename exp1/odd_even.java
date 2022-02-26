import java.util.*;
class odd_evenscan
{
       public static void main(String args[])
       {
       Scanner in= new Scanner(System.in);
       System.out.println("Enter the number:");
       int n=in.nextInt();
        if(n%2==0)
        {
          System.out.println("The number is even");
        }
           else
           {
             System.out.println("The number is odd");
           }
       }
}
