package ArrayProgram;


//check duplicate occurrence in array
public class Array005 {
    public static void main(String[] args) {
        int[] arr={7,8,2,4,8,9,4,7,7,2,6,2,7};
        for(int i=0;i<arr.length;i++){
            boolean alreadyVisited = false;
            for (int k=0;k<i;k++)
            {
                if(arr[k]==arr[i])
                {
                    alreadyVisited=true;
                    break;
                }
            }
            if (alreadyVisited)
                continue;
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
