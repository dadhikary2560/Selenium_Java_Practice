package Methods.Interface;

public class AnonymousClass {
    //the InterfaceBase class is an interface with only abstract method
    //so it can be called a FUNCTIONAL INTERFACE

    public static void main(String[] args) {
        InterfaceBase obj=new InterfaceBase() {

            //as can be seen the abstract method available in the Interface
            //is getting overridden in here
            @Override
            public void m1() {
                System.out.println("Hi i am anonymous class method");
            }
        };                  //is the end of anonymous class
        obj.m1();           //calling the original abstract method
    }
}
