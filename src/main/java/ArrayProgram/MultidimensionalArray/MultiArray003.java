package ArrayProgram.MultidimensionalArray;


//index of highest element
public class MultiArray003 {
    public static void main(String[] args) {
        int[] arr={4,5,8,12,7,2};
        int position=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[position])        //compared with arr[0]
            {
                position=i;                 //position is now changed what we have in i
            }
        }
        System.out.println(position);
    }
}
