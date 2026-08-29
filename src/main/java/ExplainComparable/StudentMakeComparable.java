package ExplainComparable;

public class StudentMakeComparable implements Comparable{
    int roll;
    String name;
    float marks;

    public StudentMakeComparable(int roll, String name, float marks)
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Object o) {
        StudentMakeComparable s1=(StudentMakeComparable) o;
        if(this.roll<s1.roll)
        {
            return -9;
        }
        else if(this.roll>s1.roll)
        {
            return 9;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        return name+" "+roll;
    }
}
