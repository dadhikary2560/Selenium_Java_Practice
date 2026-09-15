package Methods.Interface;

public interface InterfaceBase {

    //is a normal method, and normal method is abstract
    void m1();


    //is a default method, which can be written like a instance method,
    // only the DEFAULT Keyword is required
    public default void m2()
    {
        System.out.println("Hi i am default method");
    }

    //Static method
    public static void m3()
    {
        System.out.println("Hi i am static method");
    }

    public static void main(String[] args) {
        m3();

        //DEFAULT Method can be written, however it can be accessed by the child class which
        //implements the interface

        //Check child class for example
    }
}
