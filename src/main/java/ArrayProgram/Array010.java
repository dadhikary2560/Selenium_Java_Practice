package ArrayProgram;

import java.util.Arrays;

public class Array010 {
    public static void main(String[] args) {
        int[] arr={4,5,8,12,7,2};
        int[] arr2={1,3,6,10};
        int[] arr3=new int[arr.length+arr2.length];
        for (int i=0;i<arr.length;i++)
        {
            arr3[i]=arr[i];
        }
        for (int j=0;j<arr2.length;j++)
        {
            arr3[arr.length+j]=arr2[j];
        }
        int place=0;
        int oddPlace=0;
        for (int i=0;i<arr3.length;i++)
        {
            if(arr3[i]%2==0)
            {
                arr[place]=arr3[i];     //filling up the old capacity of arr
                place++;
            }
            else
            {
                arr2[oddPlace]=arr3[i];     //filling up the old capacity of arr2
                oddPlace++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}


//better suggestion is to use completely new arrays for even and odd numbers

//check example on Array011 program