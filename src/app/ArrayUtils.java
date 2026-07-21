package app;

import java.util.Arrays;

public class ArrayUtils {

    @MethodInfo(
            name = "findMax",
            returnType = "int",
            description = "Знаходить максимальний елемент у масиві цілих чисел."
    )
    @Author(firstName = "Олександр", lastName = "Шевченко")
    public int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім");
        }
        return Arrays.stream(array).max().getAsInt();
    }

    @MethodInfo(
            name = "reverseArray",
            returnType = "int[]",
            description = "Перевертає порядок елементів у масиві на протилежний."
    )
    @Author(firstName = "Марія", lastName = "Коваленко")
    public int[] reverseArray(int[] array) {
        if (array == null) return null;
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}