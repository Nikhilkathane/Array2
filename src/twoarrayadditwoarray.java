public class twoarrayadditwoarray {
    public static void main(String[] args) {
        int [][] a={{1,2,3,4},{4,5,6,7},{8,9,10,11},{11,12,13,14}};
        int [][] b={{1,2,3,4},{4,5,6,7},{8,9,10,11},{11,12,13,14}};
        int [][] c=new int[4][4];


        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];// addtwo matrices in two D array

                System.out.print(c[i][j]+" ");

            }
            System.out.println();

        }




    }
}
