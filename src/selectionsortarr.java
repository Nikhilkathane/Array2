//selection sorting
import java.util.Arrays;

public class selectionsortarr {
    public static void main(String[] args) {
        int a[]={11,33,44,22,25};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++) {
                int min = i;
                if (a[j] > a[min]) //for > Ascending, < for decscending
                {
                    min = j;
                }

                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;

            }
        }
        System.out.println(Arrays.toString(a));
    }
}



