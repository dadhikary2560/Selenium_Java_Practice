package ForLoopPrograms;

import java.util.Scanner;

/*Print
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *           for a total of 5 lines*/


public class ForLoop006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many rows");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
           System.out.println();
        }
    }
}
