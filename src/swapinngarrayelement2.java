// reverse array elements or swapping array without 3rd variable
public class swapinngarrayelement2 {
    public static void main(String[] args) {
        int a[]={12,13,15,76,93,23,45};
        int i=0;
        int j=a.length-1;

        while (i<j)
        {
            a[i]=a[i]+a[j];
            a[j]=a[i]-a[j];
            a[i]=a[i]-a[j];
            i++;
            j--;
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
