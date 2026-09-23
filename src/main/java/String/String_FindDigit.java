package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_FindDigit {
    public static void main(String[] args) {
        String s="D3ba5ra3";
        Pattern p=Pattern.compile("\\d");       //setting the pattern
        Matcher m=p.matcher(s);                       //matches pattern with the string
        int res=0;
        while (m.find())                                //keep finding matches
        {
            res= Integer.parseInt(m.group());           //group all the matches
            System.out.println(res);
        }
    }
}
