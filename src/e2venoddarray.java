import java.util.Arrays;

public class e2venoddarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int evencnt=0;
        int oddcnt=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                evencnt++;
            else
                oddcnt++;

        }
        System.out.println(evencnt+" "+oddcnt);
        int[] even1 =new int[evencnt];
        int[] odd1 =new int[oddcnt];
        int evenind=0;
        int oddind=0;
        for(int i=0;i<a.length;i++)
        {
            if (a[i] % 2 == 0)
                even1[evenind++] = a[i];
            else
                odd1[oddind++] = a[i];
        }
        System.out.println("Even array :");

        for(int i=0;i<even1.length;i++) {
    System.out.println(even1[i]);
}
        System.out.println("Odd array :");

        for(int i=0;i<odd1.length;i++)
{
        System.out.println(odd1[i]);

    }
}

    }

