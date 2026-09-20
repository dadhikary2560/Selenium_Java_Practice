package String;

public class HowToWriteStringVariables {
    static String s=new String("Hello my name is Debabrat");
    //Stores data first in SCP and then in HEAP memory

    static String s1="Hello my name is Debabrat";
    //Stores data in SCP (String Constant Pool)

    public boolean isEqual()
    {
        if(s==s1)
            System.out.println("s and s1 has the same address");
        return false;
    }

    public boolean hasSameCharacters()
    {
        if(s.equalsIgnoreCase(s1))
            System.out.println("s and s1 has the same characters");
        return true;
    }

    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(s1);
        HowToWriteStringVariables obj=new HowToWriteStringVariables();
        System.out.println(obj.isEqual());
        System.out.println(obj.hasSameCharacters());
    }
}
