package ArrayProgram;

import java.util.Arrays;

public class Array011 {
    public static void main(String[] args) {
        int[] arr={4,5,11,9,8,12,7,2};
        int[] arr2={1,3,6,10};
        int[] arr3=new int[arr.length+arr2.length];

        //merging the two original arrays into array 3

        for (int i=0;i<arr.length;i++)        //from 0th position to array length
        {
            arr3[i]=arr[i];
        }
        for (int i=0;i<arr2.length;i++)
        {
            arr3[arr.length+i]=arr2[i];     //continuing array3 from where we have left in the last loop
        }
        //printing the merged array
        System.out.println(Arrays.toString(arr3));

        //crating two new variables so that we can count how many odd and even numbers are present in the array3
        //so that accordingly we can create new arrays for ODD and even
        int oddCount=0, evenCount=0;
        for (int i=0;i<arr3.length;i++)
        {
            if(arr3[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }

        //new arrays created
        int[] odd=new int[oddCount];
        int[] even=new int[evenCount];

        //new variables created so that we can increase placement of odd and even array
        int oddPlace=0, evenPlace=0;
        for (int i=0;i<arr3.length;i++)
        {
            if(arr3[i]%2==0)
            {
                even[evenPlace]=arr3[i];
                evenPlace++;
            }
            else
            {
                odd[oddPlace]=arr3[i];
                oddPlace++;
            }

        }
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));

    }
}
