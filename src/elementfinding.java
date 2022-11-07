public class elementfinding {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 400, 50, 60};
        int ele = 40;
        boolean flag = false;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == ele) {
                System.out.println("found");
                flag = true;
                break;
            }
        }

        if(!flag)
            System.out.println("Not found");
    }
}
