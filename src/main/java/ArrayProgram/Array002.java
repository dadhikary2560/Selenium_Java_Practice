package ArrayProgram;

public class Array002 {
    public static void main(String[] args) {
        int[] arr ={2,3,4,5,6};
        int square;
        for (int i=0;i<arr.length;i++)
        {
            square=(int)Math.pow(arr[i],2);
            System.out.println(square);
        }
    }
}
