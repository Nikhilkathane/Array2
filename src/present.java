public class present {
    public static void main(String[] args) {
        int a[] = {11, 22, 33, 44, 55};
        int num = 66;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num)
                cnt++;
        }
        if (cnt == 0)
            System.out.println("not present");
        else
            System.out.println("present");
    }



}
