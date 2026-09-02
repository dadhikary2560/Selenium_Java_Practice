package ForLoopPrograms;

import java.awt.print.Printable;

/*Print

        *
        * *
        * * *
        * *
        *                   for a total of 5 lines*/


public class ForLoop007 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)                  //5 can be replaced by n

        {
            if(i>(5/2+1))
            {
                for (int j=i;j<=5;j++)
                    System.out.print("* ");
            }
            else
            {
                for(int j=1;j<=i;j++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
