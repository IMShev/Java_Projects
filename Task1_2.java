/* Вывести все простые числа от 1 до 1000 */

public class Task1_2 {
    public static void main(String[] args) {
        int i, j;
        System.out.print(2 + "  "); // "2" выводим отдельно, тк все остальные простые числа - нечетные
        for (i = 3; i < 1000; i += 2) {
            int count = 0;

            for (j = 3; j <= i; j += 2) {
                if ((i % j) == 0)
                    count++;
            }
            if (count < 2)
                System.out.print(i + "  ");
        }
    }
}
