package Methods.Interface;

public class InterfaceChild implements InterfaceBase{
    @Override
    public void m1() {
        System.out.println("overridden method of InteterfaceBase");
    }

    @Override
    public void m2() {
        System.out.println("i was the default method from the parent class");
    }

    public static void main(String[] args) {
        InterfaceBase test=new InterfaceBase() {
            @Override
            public void m1() {
                System.out.println("Hi i am from anonymous class");
            }
        };
        test.m1();      //calling m1 method from the parent class
        test.m2();      //calling m2 method from the parent class
        InterfaceBase.m3();     //calling m3 method from parent class, can be called as
                                // it is in same package and is static
        InterfaceChild child=new InterfaceChild();      //creating child class object
        child.m2();                                     //calling child class method
    }
}
