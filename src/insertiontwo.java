import javax.swing.*;
import java.util.Arrays;

public class insertiontwo {
    public static void main(String[] args) {
        int a[]={6,4,7,1,3};
        for(int i=0;i< a.length;i++)
        {
            int temp=a[i];
            int j=i;
            for(;j>0;j--)
            {
                if(temp<a[j-1])
                {
                    a[j] = a[j - 1];

                }
                else
                {
                    break;
                }
            }
            a[j]=temp;

            }
        System.out.println(Arrays.toString(a));
        }
    }

