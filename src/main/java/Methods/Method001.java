package Methods;


//instanceVSstatic method
public class Method001 {
    public void m1()
    {
        System.out.println("this is a instance method");
    }

    public  static void m2()
    {
        System.out.println("this is a static method");
    }
    public static void main(String[] args) {
     Method001 methodCall = new Method001();
     methodCall.m1();                               //to call instance method
     m2();                                          //Static method can be directly called
    }
}
