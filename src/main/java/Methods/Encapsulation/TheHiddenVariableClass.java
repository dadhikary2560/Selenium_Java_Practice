package Methods.Encapsulation;

public class TheHiddenVariableClass {
    private float result;


    //see as we have made the main variable private it is not visible to other classes
    //only set and get method is accessible in this class
    public void setResult(int marks) {
        this.result = marks/6.0f;
    }

    public float getResult() {
        return result;
    }
}
