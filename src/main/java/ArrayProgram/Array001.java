package ArrayProgram;

import java.util.Scanner;

public class Array001 {
    public static void main(String[] args) {
        System.out.println("Define size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
//        System.out.print(arr.length);
        System.out.println("Enter values for array");
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
