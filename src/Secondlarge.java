public class Secondlarge {
    public static void main(String[] args) {
        int a[]={220,1,2,3,500,4,5};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
            if(a[i]>max)
                max=a[i];

        int max2=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
            if(a[i]!=max && a[i]>max2)
                max2=a[i];

        System.out.println(max2);
    }
}
