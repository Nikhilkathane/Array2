public class pairwithsepcificelement {
    public static void main(String[] args) {
        int a[] = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int uniquesize = 0;
        int uniqueele = 0;
        int ele = 7;

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
        for (int i = 0; i < arrayuni.length; i++) {
            for (int j = i + 1; j < arrayuni.length; j++) {
                if (arrayuni[i] + arrayuni[j] == ele)
                    System.out.println(arrayuni[i] + " " + arrayuni[j]);
            }


        }
    }
}
