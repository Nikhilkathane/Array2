
//finding leader element in given array
public class LeaderEle
{
    public static void main(String[] args)
    {
        int a[] = {11,22,13,24,15,6};
        boolean flag = false;
        for (int i = 0; i < a.length; i++)
        {int cnt=0;
            for (int j = i;j < a.length; j++)
            {
                if (a[i] < a[j])
                    cnt++;
            }


            if (cnt==0)
                System.out.println(a[i]);
        }
    }
}



