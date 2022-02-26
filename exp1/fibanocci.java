import java.util.*;
class fibanocci
{
     public static void main(String args[])
    {
      Scanner in= new Scanner(System.in);
      System.out.println("Enter the number");
      int n=in.nextInt();
      int a,b,c,i;
      a=0;b=0;c=1;
      System.out.println("Enter the number:");
      System.out.println("Fibanocci Series:");
      for(i=1;i<=n;i++)
      {
      a=b;
      b=c; 
      c=a+b;
      System.out.println(a+"");
      }
    }
}
