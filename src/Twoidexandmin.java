//finding subarrays of array and finding their min and avg then print index of smallest min
public class Twoidexandmin {
    public static void main(String[] args) {
        int a[]={3,7,90,20,5,50,40};
        int size=3;
        int min=Integer.MAX_VALUE;
        int index=0;

        for(int i=0;i<a.length-size;i++)
        {
            int sum=0;
           for(int j=i;j<i+size;j++)
           {
               sum=sum+a[j];
           }
           if(sum<min)
           {
               min=sum;
               index=i;
           }
        }
        System.out.println(index+" "+min+" "+(min/size));//index,smallest min ,avg
    }
}
