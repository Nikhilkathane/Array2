public class Twoarraymaxele {
    public static void main(String[] args) {
        int [][] a={
                {1,2,3},
                {11,15,16},
                {18,22,24}
        };
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
