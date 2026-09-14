package Methods.OverloadingAndOverriding;

public class OverridingChildClass extends OverridingBase{
    @Override
    public void m1() {
        System.out.println("Inherited instance method");
        System.out.println("or we can say overriden instance method");
    }

    //constructor from parent class can not be directly overridden,
    // so we use super to call parent class's instance
    public OverridingChildClass()
    {
        super();
    }

    public static void main(String[] args) {
        new OverridingChildClass().m1();
        new OverridingChildClass();
    }
}
