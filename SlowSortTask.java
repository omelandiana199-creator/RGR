public class SlowSortTask {

    private SlowSortTask() {}

    public static void slowSort(double[] a, int i, int j) {
        if (i >= j) {
            return;
        }

        int m = i + (j - i) / 2;

        slowSort(a, i, m);
        slowSort(a, m + 1, j);

        if (a[m] > a[j]) {
            double temp = a[m];
            a[m] = a[j];
            a[j] = temp;
        }

        slowSort(a, i, j - 1);
    }
}