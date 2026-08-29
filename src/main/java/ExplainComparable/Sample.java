package ExplainComparable;

import java.util.TreeSet;

public class Sample {
    public static void main(String[] args) {
        StudentMakeComparable dev=new StudentMakeComparable(12, "Debabrat", 9.0f);
        StudentMakeComparable manshi=new StudentMakeComparable(34, "Manshi", 8.5f);
        StudentMakeComparable manish=new StudentMakeComparable(13, "Manish", 7.4f);
        StudentMakeComparable tushar=new StudentMakeComparable(14, "tushar", 8.7f);

        TreeSet ts=new TreeSet();
        ts.add(dev);
        ts.add(manshi);
        ts.add(manish);
        ts.add(tushar);

        System.out.println(ts);
    }
}
