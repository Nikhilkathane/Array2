// reverse array elements or swapping array with 3rd variable

public class swappingarrayelement3 {
    public static void main(String[] args) {
        int a[]={12,13,15,76,93,23,45};
        int i=0;
        int j= a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k< a.length;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
