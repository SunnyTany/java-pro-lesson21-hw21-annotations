package app;

public class ArrayUtils {

<<<<<<< Updated upstream
    // Приватний конструктор унеможливлює створення об'єктів утилітарного класу
=======
    // A private constructor makes it impossible to create objects of a utility class
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        // Захисна перевірка: якщо масив null, порожній або з 1 елемента — повертаємо його одразу
=======
        // Protective check: if the array is null, empty, or has 1 element, return it immediately
>>>>>>> Stashed changes
        if (array == null || array.length <= 1) {
            return array;
        }

<<<<<<< Updated upstream
        // Алгоритм "двох вказівників" для розвороту масиву In-Place (O(1) пам'яті)
=======
        // "Two-pointer" algorithm for In-Place array reversal (O(1) memory)
>>>>>>> Stashed changes
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
<<<<<<< Updated upstream
            // Міняємо елементи місцями через тимчасову змінну
=======
            // Swap elements using a temporary variable
>>>>>>> Stashed changes
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        return array;
    }
}