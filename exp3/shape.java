class OverloadDemo

{

    void area(double x,double y)

    {

        double area =0.5*x*y;

        System.out.println("the area of the square is "+area+" sq units");

    }

    void area(float x, float y)

    {

        System.out.println("the area of the rectangle is "+x*y+" sq units");

    }

    void area(double x)

    {

        double z = 3.14 * x * x;

        System.out.println("the area of the circle is "+z+" sq units");

    }

}

class shape

{

     public static void main(String args[]) 

	{	   OverloadDemo ob = new OverloadDemo();

	   ob.area(5.6,5.6);

	   ob.area(11,12);

	   ob.area(2.5);

        }

}
