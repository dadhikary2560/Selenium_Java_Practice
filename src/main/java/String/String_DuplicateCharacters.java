package String;

public class String_DuplicateCharacters {
    public static void main(String[] args) {
        String s="Hi my name is Debabrat Adhikary from Assam";
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ')
                continue;
            boolean alreadyFound=false;
            for (int k=0;k<i;k++)
            {
                if(s.charAt(i)==s.charAt(k))
                {
                    alreadyFound=true;
                    break;
                }
            }
            if(alreadyFound)
                continue;
            int count=0;
            for (int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }
            if(count>1)
                System.out.println(s.charAt(i)+" has appeared: "+count);
        }
    }
}
