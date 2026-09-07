package ArrayProgram;

public class Array008 {
    public static void main(String[] args) {
        int[] arr={75,85,9,11,35};
        int max=0 , secondMax =0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax && arr[i]<max) {
                secondMax=arr[i];
            }
        }
        System.out.println(max+" "+secondMax);
    }
}
