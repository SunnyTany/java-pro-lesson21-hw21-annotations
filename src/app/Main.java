package app;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Demonstration of the methods
        ArrayUtils utils = new ArrayUtils();
        int[] numbers = {3, 5, 1, 9, 2};

        System.out.println("--- Демонстрація роботи методів ---");
        System.out.println("Оригінальний масив: " + Arrays.toString(numbers));
        System.out.println("Максимум: " + utils.findMax(numbers));
        System.out.println("Перевернутий масив: " + Arrays.toString(utils.reverseArray(numbers)));
        System.out.println();

        // Reading annotations through reflection
        System.out.println("--- Зчитування анотацій через рефлексію ---");
        Class<ArrayUtils> arrayUtilsClass = ArrayUtils.class;
        Method[] methods = arrayUtilsClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Досліджуємо метод Java: " + method.getName());

            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo info = method.getAnnotation(MethodInfo.class);
                System.out.println("  [Метод]: " + info.name());
                System.out.println("  [Тип повернення]: " + info.returnType());
                System.out.println("  [Опис]: " + info.description());
            }

            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println("  [Автор]: " + author.firstName() + " " + author.lastName());
            }
            System.out.println("---------------------------------------");
        }
    }
}