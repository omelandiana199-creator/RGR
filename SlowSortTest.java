import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SlowSortTest {

    // Допустима похибка для порівняння дійсних чисел 
    private static final double DELTA = 1e-9;

    @Test
    public void testRandomNumbers() {
        // Набір 1: Випадкові невідсортовані числа
        double[] actual = {4.0, 2.0, 7.0, 1.0, 8.0, 3.0, 6.0, 5.0, 9.0, 0.0, 10.0};
        double[] expected = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};

        SlowSortTask.slowSort(actual, 0, actual.length - 1);

        // Перевіряємо, чи співпадає результат з очікуванням
        assertArrayEquals(expected, actual, DELTA, "Помилка у тесті 1");
    }

    @Test
    public void testNegativeNumbersAndDuplicates() {
        // Набір 2: Масив з від'ємними числами та дублікатами
        double[] actual = {-2.0, 4.0, 0.0, -2.0, 5.0, 1.0, 9.0, 4.0, -1.0, 3.0, 8.0};
        double[] expected = {-2.0, -2.0, -1.0, 0.0, 1.0, 3.0, 4.0, 4.0, 5.0, 8.0, 9.0};

        SlowSortTask.slowSort(actual, 0, actual.length - 1);

        assertArrayEquals(expected, actual, DELTA, "Помилка у Тесті 2");
    }

    @Test
    public void testReverseSortedArray() {
        // Набір 3: Вже відсортований масив у зворотному порядку
        double[] actual = {11.0, 10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0};
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0};

        SlowSortTask.slowSort(actual, 0, actual.length - 1);

        assertArrayEquals(expected, actual, DELTA, "Помилка у Тесті 3");
    }
}