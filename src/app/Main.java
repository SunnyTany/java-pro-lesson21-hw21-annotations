package app;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 9, 2};

        System.out.println("--- Демонстрація роботи статичних методів ---");
        System.out.println("Оригінальний масив: " + Arrays.toString(numbers));

        // Виклик статичних методів без створення об'єкта
        System.out.println("Максимум: " + ArrayUtils.findMax(numbers));

        ArrayUtils.reverseArray(numbers);
        System.out.println("Перевернутий масив (in-place): " + Arrays.toString(numbers));
        System.out.println();

        System.out.println("--- Зчитування анотацій через рефлексію ---");
        Class<ArrayUtils> arrayUtilsClass = ArrayUtils.class;
        Method[] methods = arrayUtilsClass.getDeclaredMethods();

        for (Method method : methods) {
            // Ігноруємо приватний конструктор, аналізуємо тільки методи
            if (method.getName().equals("main")) continue;

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