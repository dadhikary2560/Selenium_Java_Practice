package ExplainComparator;

import java.util.Comparator;

public class TeacherComparesStudent implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;
        if(s1.roll<s2.roll)
            return -9;
        else if (s1.roll>s2.roll) {
            return 9;
        }
        else
            return 0;
    }


}
