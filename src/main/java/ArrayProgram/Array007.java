package ArrayProgram;


import java.util.Arrays;
import java.util.Scanner;

//Sort the array
public class Array007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int arraySize=sc.nextInt();
        int[] arr=new int[arraySize];
        System.out.println("Enter values in the array");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();



        for(int j=0;j<arr.length;j++)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    arr[i]=arr[i]+arr[i+1];
                    arr[i+1]=arr[i]-arr[i+1];
                    arr[i]=arr[i]-arr[i+1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
