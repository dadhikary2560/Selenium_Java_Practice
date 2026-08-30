package ForLoopPrograms;

import java.util.Scanner;

/*print
                   1
                  2 2
                 3 3 3
                4 4 4 4                for total lines=4 */


public class ForLoop001 {
    public static void main(String[] args) {
        System.out.println("please enter value for total lines");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        for (int i=0;i<=n;i++)
        {
            for(int space=n;space>i;space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
                System.out.print(num+" ");
            num++;
            System.out.println();
        }
    }
}
