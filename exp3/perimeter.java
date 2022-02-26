public class perimeter {
    public static void main(String args[]){
        testclass obj1 =new testclass(4.5, 5.6);
        testclass obj=new testclass(4.5);
    }
}

class testclass{
    testclass(double a,double b){
        double perimeter=2*(a+b);
        System.out.println("the perimeter of the rectangle"+ perimeter+"\n");
    }
    testclass(double a){
        double perimeter=2*3.14*a;
        System.out.println("the perimeter of the rectangle"+ perimeter+"\n");
    }
}
