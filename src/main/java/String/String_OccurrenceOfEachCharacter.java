package String;

public class String_OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String s="Hi i am string representing String";
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == ' ')
                continue;
            boolean alreadyFound = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(i) == s.charAt(k)) {
                    alreadyFound = true;
                    break;
                }
            }
            if (alreadyFound)
                continue;
            int count =1;
            for (int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }
            if(count>0)
                System.out.println("Occurrence of the character "+s.charAt(i)+" "+count);
        }
    }
}
