
//unique element array Size

public class uniqueArraySize {
    public static void main(String[] args) {
        int a[] ={1,2,3,2,1,3,4,8};
        int uniquesize=0;
        for(int i=0;i<a.length;i++)
        {
            int cnt=0;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    cnt++;
                    break;
                }
            }
            if(cnt==0)
            {
                uniquesize++;
            }
        }
        System.out.println(uniquesize);
}
}
