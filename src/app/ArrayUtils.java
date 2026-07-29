package app;

public class ArrayUtils {

    // A private constructor makes it impossible to create objects of a utility class
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

        // Protective check: if the array is null, empty, or has 1 element, return it immediately
        if (array == null || array.length <= 1) {
            return array;
        }

        // "Two-pointer" algorithm for In-Place array reversal (O(1) memory)
        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            // Swap elements using a temporary variable
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        return array;
    }
}