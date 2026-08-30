package ExplainComparator;
import java.util.TreeSet;

public class SampleStudent {
    public static void main(String[] args) {
        Student dev=new Student(12, "Debabrat", 9.0f);
        Student manshi=new Student(34, "Manshi", 8.5f);
        Student manish=new Student(13, "Manish", 7.4f);
        Student tushar=new Student(14, "tushar", 8.7f);

        TreeSet ts=new TreeSet(new TeacherComparesStudent());
        ts.add(dev);
        ts.add(manshi);
        ts.add(manish);
        ts.add(tushar);

        System.out.println(ts);
    }
}
