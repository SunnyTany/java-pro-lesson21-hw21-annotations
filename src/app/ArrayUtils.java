package app;

public class ArrayUtils {

    // Приватний конструктор унеможливлює створення об'єктів утилітарного класу
    private ArrayUtils() {
        throw new UnsupportedOperationException("Це утилітарний клас, створення екземплярів заборонено!");
    }

    @MethodInfo(
            name = "findMax",
            returnType = "int",
            description = "Знаходить максимальний елемент у масиві цілих чисел."
    )
    @Author(firstName = "Олександр", lastName = "Шевченко")
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім або null");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @MethodInfo(
            name = "reverseArray",
            returnType = "int[]",
            description = "Перевертає порядок елементів у масиві на протилежний без додаткової пам'яті."
    )
    @Author(firstName = "Марія", lastName = "Коваленко")
    public static int[] reverseArray(int[] array) {
        // Захисна перевірка: якщо масив null, порожній або з 1 елемента — повертаємо його одразу
        if (array == null || array.length <= 1) {
            return array;
        }

        // Алгоритм "двох вказівників" для розвороту масиву In-Place (O(1) пам'яті)
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Міняємо елементи місцями через тимчасову змінну
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        return array;
    }
}