import java.util.Arrays;

//first remove duplicate element and then creates pair of elements
public class pairuniquearr {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 3, 2};
        int uniquesize = 0;
        int uniqueele = 3;


        for (int i = 0; i < a.length; i++) {
            int cnt = 0;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    cnt++;
                    break;
                }
            }
            if (cnt == 0) {
                uniquesize++;
            }
        }
        // System.out.println(uniquesize);
        int[] arrayuni = new int[uniquesize];
        int uniqueind = 0;
        for (int i = 0; i < a.length; i++) {
            int cnt = 0;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    cnt++;
                    break;
                }
            }
            if (cnt == 0) {

                arrayuni[uniqueind] = a[i];
                uniqueind++;
            }
        }
        System.out.println(Arrays.toString(a));
        //following are logic for creating pairs in array
        for (int i = 0; i < arrayuni.length; i++) {
            for (int j = 0; j < arrayuni.length; j++) {

                    System.out.println(a[i] + " " + a[j]);
                }


        }
    }
}


