import java.util.Arrays;
//insertion sorting in an array
public class insertionsort {
    public static void main(String[] args) {
        int a[]={33,22,11,44,66,55};
        for(int i=1;i<a.length;i++)
        {
        int temp=a[i];
        int j=i;
        for(;j>0;j--)
        {
            if (temp < a[j - 1])
            {
                a[j] = a[j - 1];
            } else
            {
                break;
            }
        }
        a[j]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
