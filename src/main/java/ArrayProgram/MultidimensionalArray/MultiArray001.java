package ArrayProgram.MultidimensionalArray;


import java.util.Arrays;

//find the sub-array, which has the max
public class MultiArray001 {
    public static void main(String[] args) {
        int[][] arr={{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[] arr2=null;
        int newSum=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr.length;j++)
            {
                sum=sum+arr[i][j]; //calculates sum for the current sub-array
                                   //sum is only accessible inside, so that, it can get new value for each sub-array

//                System.out.println(sum);
            }
         if(newSum<=sum)        //putting sum in newSum so that it can be used outside
            {
                newSum=sum;
                arr2=arr[i];       //putting sub-array iin a new array altogether
            }
        }
        System.out.println(newSum+" "+ Arrays.toString(arr2));
     }
}
