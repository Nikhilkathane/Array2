public class equality {
    public static void main(String[] args) {
        int a[] = {11, 22, 33, 44};
        int b[] = {11, 22, 33, 44};

        myCode(a, b);
    }
    private static void myCode(int a[],int b[])
    {
        if(a.length== b.length)
        {
            int cnt=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]!=b[i])
                    cnt++;

            }
            if(cnt==0)
                System.out.println("same");
            else
                System.out.println("not same");
        }
        else
            System.out.println("not same");
    }
}





