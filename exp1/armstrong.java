import java.util.*;
class armstrong
{
     public static void main(String args[])
    {
      Scanner in= new Scanner(System.in);
      System.out.println("Enter the number");
      int n=in.nextInt();
      int k=0;
      n=k;
      int d,ar=0;
          while(n!=0)
          {
           d=n%10;
           ar=ar+(d*d*d);
           n=n/10;
          }
             if(k==ar)
            {
           System.out.println("The number is armstrong");
            }
              else
             {
            System.out.println("The number is not armstrong");
             }

     }
}
