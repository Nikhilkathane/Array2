public class methodpresent {
    public static void main(String[] args) {


    int a[] = {11, 22, 33, 44};
    int num = 66;
    if(

    contains(a, num)==0)
            System.out.println("not present");
    else
            System.out.println("present");
}
private static int contains (int a[],int num) {
    int cnt = 0;
    for (int i = 0; i < a.length; i++)
    {
        if (a[i] == num)
            cnt++;
}
            return cnt;

}
}
