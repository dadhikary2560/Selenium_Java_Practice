package Methods.OverloadingAndOverriding;

public class OverridingBase {
    public void m1()
    {
        System.out.println("Hi i am the base method");
        System.out.println("I am also the instance method");
    }

    //static method can not be overriden, so it gets hidden in the child class
    public static void m2()
    {
        System.out.println("Hi i am the static method");
    }

    public static void main(String[] args) {
        m2();
        new OverridingBase().m1();
    }
}
