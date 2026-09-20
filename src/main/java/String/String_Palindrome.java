package String;

public class String_Palindrome {
    public static void main(String[] args) {
        String s="Debabrat";
        String result="";
        for (int i=s.length()-1;i>=0;i--)
        {
            result=result+s.charAt(i);
            System.out.print(result+" ");
        }
        System.out.println();
        if(result.equalsIgnoreCase(s))
            System.out.println("the string provided is palindrome");
        else
            System.out.println("not palindrome string");
    }
}
