package Methods;

public class Method002 {
    public static void main(String[] args) {
        Method001.m2();                     //Static method can be directly called with class name
        Method001 instance=new Method001();
        instance.m1();                      // just to call method we are in need of a class object
    }
}
