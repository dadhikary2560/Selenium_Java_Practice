package Methods.OverloadingAndOverriding;

public class OverridingChildClass extends OverridingBase{
    @Override
    public void m1() {
        System.out.println("Inherited instance method");
        System.out.println("or we can say overriden instance method");
    }

    public static void main(String[] args) {
        new OverridingChildClass().m1();
    }
}
