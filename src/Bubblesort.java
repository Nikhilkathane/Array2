import java.util.Arrays;
//bubble sorting in array

public class Bubblesort {
    public static void main(String[] args) {
        int a[]= {11, 33, 22, 12, 24};
                for(int i=0;i<a.length;i++)
                {
                    for(int j=0;j<a.length-1;j++)
                    {
                        if(a[j]>a[j+1])
                        {
                            int temp=a[j];
                            a[j]=a[j+1];
                            a[j+1]=temp;
                        }
                    }
        }
                System.out.println(Arrays.toString(a));
    }
    }

