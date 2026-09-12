package Methods.OverloadingAndOverriding;


//same name but with different arguments
public class Overloading
{
    public void m1()
    {
        System.out.println("Hi i am no argument method");
    }
    public void m1(int a)
    {
        System.out.println("HI i am parameterized method, value received: "+a);
    }
    public int m1(String a)
    {
        System.out.println("Hi "+a);
        return 7;
    }
    //all these are instance methods

    public static void m2()
    {
        System.out.println("Hi i am static method");
    }

    public static void main(String[] args) {
        Overloading methodCall=new Overloading();
        methodCall.m1();
        methodCall.m1(7);
        System.out.println(methodCall.m1("Debabrat"));

        m2();
    }
}
