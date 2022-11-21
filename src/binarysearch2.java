public class binarysearch2 {
    public static void main(String[] args) {
        int a[] = {11, 22, 33, 44, 55, 66};
        int start = 0;
        int end = a.length - 1;
        int num = 22;

        while (true)
        {
            int mid=(start+end)/2;
            if (a[mid] == num)
            {
                System.out.println("found");
                break;
            }

            else if (num > a[mid])
            {
                start = mid + 1;
            }
            else
            {

                end = mid - 1;
            }
            if (start > end)
            {
                System.out.println("not found");
                break;
            }

        }
    }
}
