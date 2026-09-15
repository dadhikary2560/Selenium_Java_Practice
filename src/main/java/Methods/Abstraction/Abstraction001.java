package Methods.Abstraction;

public abstract class Abstraction001 {

    //is constructor allowed?
    //it is allowed however no object creation can be done
    //so accessible only through child class
    public Abstraction001()
    {
        System.out.println("i am constructor");
    }

    //purely an abstract method
    public abstract void m1();

    //an instance method
    public void m2()
    {
        System.out.println("Hi i am instance method");
    }

    //this is a static method
    //remember static method can not be overridden
    public static void m4()
    {
       System.out.println("Hi i am static method");
    }
    public static void main(String[] args) {
        // new Abstraction001(); object creation is not allowed,
        //to access constructor we have to access it through child class
        m4();       ///m4 method can be directly accessed as it does not require any object creation
    }
}
