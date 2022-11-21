public class saddlepoint {
    public static void main(String[] args) {
        int a[][] = {{6,3,9},
                {9, 7, 8},
                {2, 4, 5}
        };
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                boolean smallinrow=true;
                for (int k = 0; k < a.length; k++) {
                    if (a[i][j] < a[i][k]) {
                        smallinrow = false;
                        break;
                    }

                }
                boolean largeincol = true;
                for (int k = 0; k < a.length; k++) {
                    if (a[i][j] < a[i][k])
                        largeincol = false;

                    break;
                }

                if (smallinrow == true && largeincol == true) {
                    System.out.println(a[i][j]);
                    found = true;
                }
            }
            if (!found)
            {
                System.out.println("no saddle point");
            }
        }
    }
}