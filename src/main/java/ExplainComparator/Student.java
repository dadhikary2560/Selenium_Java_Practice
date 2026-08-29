package ExplainComparator;

public class Student {
    int roll;
    String name;
    float marks;

    public Student(int roll, String name, float marks)
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return name+" "+roll;
    }
}
