//first set positive number and then negative in array
public class positviefirstthennegative {
    public static void main(String[] args) {
        int a[] = {11,- 22, 33, -44, 55, 66 - 77};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < 0 && a[j] > 0)
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
