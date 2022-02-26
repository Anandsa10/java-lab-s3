public class concate {
    public static void main(String args[]){
        test obj=new test();
        obj.concatenate(5, 6);
        obj.concatenate("raj", "esh");
    }
}
class test {
    void concatenate(int a,int b){
        int sum=a+b;
        System.out.println("the sum is"+sum+"\n");
    }
    void concatenate(String a,String b){
        String name = a+ " " + b; 
        System.out.println(name);
    }
}
