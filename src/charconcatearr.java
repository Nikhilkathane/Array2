// creating new array with both concatenation
import java.util.Arrays;

public class charconcatearr {
    public static void main(String[] args) {
        char[] c1={'a','b','c','d'};
        char[]  c2={'e','f','g'};
        char[] c3=new char[c1.length+ c2.length];
        int c3index=0;
        for(int i=0;i< c1.length || i< c2.length;i++)
        {
            if(i< c1.length)
                c3[c3index++]=c1[i];
            if(i< c2.length)
                c3[c3index++]=c2[i];

        }
        System.out.println(Arrays.toString(c3));
    }
}
