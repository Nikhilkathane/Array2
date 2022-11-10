import java.util.Arrays;

public class evenoddarray {
    public static void main(String[] args) {
        int a[]={900,2,3,4,500,6,8};
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                even++;
            else
                odd++;

        }
        int[] even1 =new int[even];
        int[] odd1 =new int[odd];
        int evenind=0;
        int oddind=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] % 2 == 0)
                even1[evenind++] = a[i];
            else
                odd1[oddind++] = a[i];
        }

        System.out.println(Arrays.toString(even1));
        System.out.println(Arrays.toString(odd1));

    }
}
