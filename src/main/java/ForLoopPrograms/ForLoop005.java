package ForLoopPrograms;

/*print

                 *
               * 1 *
              * 1 2 *
             * 1 2 3 *                  */


public class ForLoop005 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++)
        {
            int num=1;
            if(i==1)
            {
                for (int space=5;space>i;space--)
                {
                    System.out.print(" ");
                }
                System.out.print(" *");
            }
            else
            {
                for (int space=5;space>i;space--)
                {
                    System.out.print(" ");
                }
                System.out.print("* ");
                for(int j=1;j<i;j++)
                {
                    System.out.print(num+" ");
                    num=num+1;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
