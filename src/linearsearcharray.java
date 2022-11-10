//binary search or linear serch ,Searching element in array
public class linearsearcharray {
    public static void main(String[] args) {
        int a[] = {100, 200, 300, 400, 500, 600, 700, 800};
        int start = 0;
        int end = a.length - 1;
        int search = 600;
        int mid = 0;
        while (true) {
            mid = (start + end) / 2;
            if (a[mid] == search) {
                System.out.println("element found at index:" + mid);
                break;
            } else if (search > a[mid]) {
                start = mid + 1;
            } else
            {
                end = mid - 1;
            }
            if (end < start) {
                System.out.println("element not found");
                break;
            }
        }
    }
}
