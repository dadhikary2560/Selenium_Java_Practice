package Methods;


import java.util.Scanner;

//recursion
public class Method003 {
    int i=1;
    public  void m1(int a)
    {
        System.out.println("value of a is: "+a);
        while(i<10)
        {
            i++;
            m1(5);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter some value");
        int number=sc.nextInt();
        Method003 m=new Method003();
        m.m1(number);
    }
}
