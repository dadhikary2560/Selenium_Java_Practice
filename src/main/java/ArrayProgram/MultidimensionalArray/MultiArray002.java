package ArrayProgram.MultidimensionalArray;

import java.util.Arrays;

//normal array program ascending or descending
public class MultiArray002 {
    public static void main(String[] args) {
        int[] arr={4,5,8,12,7,2};
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])       //reverse it to see ascending, currently it's descending
                {
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
