package home_work_two;

public class Shifter {
    public static int[] offset(int[] arr, int n) {
        n %= arr.length;
        int offset = arr.length + n;
        offset %= arr.length;

        for (int i = 0; i < offset; i++) {
            int temp = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = temp;
            }
        return arr;
        }
}
