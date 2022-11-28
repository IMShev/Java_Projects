/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3_3 {
    private static void printArray(List<Integer> list) {
        for (Integer element : list) {
            System.out.print(String.format("%d  ", element));
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.print("\nOriginal array: ");
        printArray(list);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        //System.out.printf("Sum of elements in array = %d\n", sum);

        double average = (double) sum / list.size();

        System.out.println("Min = " + Collections.min(list) + "\n");
        System.out.println("Max = " + Collections.max(list) + "\n");
        System.out.println("Average = " + average + "\n");

    }
}
