import java.util.*;
class primescan
{
     public static void main(String args[])
     {
      Scanner in= new Scanner(System.in);
      System.out.println("Enter the number");
      int n=in.nextInt();
      boolean flag=false;
         for(int i=2;i<n/2;i++)
         {
           if(n%i==0)
           {
             flag=true;
              break;
           }
        }
             if(flag==false)
             {
              System.out.println("Prime number");
             }
             else
              {
               System.out.println("Not prime number");
              }
     }
}
