//inner elements sum in an 2D array
public class TwoDaddinner {
    public static void main(String[] args) {
        int [][] b={{1,2,3,4},{4,5,6,7},{8,9,10,11},{11,12,13,14}};
        int sum=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                if(i!=0 && i!=3 && j!=0 && j!=3)// inner elemets sum in an array
                    sum=sum+b[i][j];
               // System.out.print(b[i][j]+" ");//for printing inner elements

            }
            }
       // System.out.println();

        System.out.println("sum : "+sum);


    }
}
