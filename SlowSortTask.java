public class SlowSortTask {

    private SlowSortTask() {}

    public static void sort(double[] a) {
        if (a == null || a.length <= 1) {
            return;
        }
        slowSort(a, 0, a.length - 1);
    }

    //Рекурсивна реалізація SlowSort.
    public static void slowSort(double[] a, int i, int j) {
        if (i >= j) {
            return;
        }

        int m = i + (j - i) / 2;

        // 1. Рекурсивно шукаємо максимуми в підмасивах
        slowSort(a, i, m);
        slowSort(a, m + 1, j);

        // 2. Порівнюємо результати в кінці кожної частини
        if (a[m] > a[j]) {
            double temp = a[m];
            a[m] = a[j];
            a[j] = temp;
        }

        // 3. Рекурсивно сортуємо все, крім знайденого максимуму
        slowSort(a, i, j - 1);
    }
}
