package home_work_two;

public class Оffseter {
    public static void offset(int[] a, int n) {
        n %= a.length;
        int offset = a.length + n;
        offset %= a.length;

        for (int i = 0; i < offset; i++) {
            int temp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
            }
        }
}
