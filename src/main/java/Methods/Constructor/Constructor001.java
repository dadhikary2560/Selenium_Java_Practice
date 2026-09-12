package Methods.Constructor;

public class Constructor001 {

    int c;
    static int d;
    //No argument constructor
    public Constructor001()
    {
        System.out.println("hi from Constructor");
    }

    //Constructor overloading
    //parameterized constructor
    public Constructor001(int a, int b)
    {
        int result=a+b;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Constructor001 call=new Constructor001();
        new Constructor001(3,4);
        System.out.println(call.c);
        System.out.println(d);
    }
}
