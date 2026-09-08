package ArrayProgram;

//check prime, find for not prime
public class Array009 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 12, 13, 18, 23, 25, 29, 31, 42};
        for (int i=0;i<arr.length;i++)
        {
            int flag=0;
            for(int j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                    flag=1;
            }
            if(flag==0)
            {
                System.out.println("number is prime: "+arr[i]);
            }
        }
    }
}
