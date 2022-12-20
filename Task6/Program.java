/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
 * Реализовать в Java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
 * выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Мар. Например: 
 *  "Введите цифру, соответствующую необходимому критерию:
 *      1 - ОЗУ
 *      2 - Обьем ЖД
 *      3 - Операционная система
 *      4 - Цвет... "
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры 
 * фильтрации можно также в Мар.
 * Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

package Task6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        Laptop lap1 = new Laptop("MacBook Air", 17, "M1", 16, 512, "MacOS", "Metallic");
        // System.out.println(lap1);
        Laptop lap2 = new Laptop("MacBook Air", 15, "M1", 8, 256, "MacOS", "White");
        // System.out.println(lap2);
        Laptop lap3 = new Laptop("Lenovo IdeaPad", 13, "Intel Celeron", 8, 128, "Windows", "Gray");
        // System.out.println(lap3);
        Laptop lap4 = new Laptop("Microsoft Surface", 14, "Intel Core i7", 16, 256, "Windows", "Gold");
        // System.out.println(lap4);
        Laptop lap5 = new Laptop("Acer Swift 3", 15, "Intel Core i5", 4, 128, "Windows", "Black");
        // System.out.println(lap5);
        Laptop lap6 = new Laptop("HP Spectre x360", 14, "Intel Core i7", 4, 256, "Windows", "Black");
        // System.out.println(lap6);
        Laptop lap7 = new Laptop("Dell XPS 13", 17, "Intel Core i7", 32, 1024, "Windows", "Metallic");
        // System.out.println(lap7);
        Laptop lap8 = new Laptop("MacBook Pro", 17, "M1 Pro", 32, 1024, "MacOS", "Black");
        // System.out.println(lap8);
        Laptop lap9 = new Laptop("Honor MagicBook", 13, "Intel Core i5", 8, 128, "Linux", "Gray");


        Stream<Laptop> laptopStream = Stream.of(lap1, lap2, lap3, lap4, lap5, lap6, lap7, lap8, lap9);
        // laptopStream.filter(p->p.getColor() ==
        // "Metallic").forEach(p->System.out.println(p));

        Map<Integer, String> selectionMap = new HashMap<Integer, String>();
        // selectionMap.put(1, "Модель ");
        selectionMap.put(1, "Размер экрана ");
        selectionMap.put(2, "Процессор");
        selectionMap.put(3, "Оперативная память ");
        selectionMap.put(4, "Жесткий диск ");
        selectionMap.put(5, "Операционная система");
        selectionMap.put(6, "Цвет ");

        Map<Integer, Integer> selectSize = new HashMap<Integer, Integer>();
        selectSize.put(1, 13);
        selectSize.put(2, 14);
        selectSize.put(3, 15);
        selectSize.put(4, 17);

        Map<Integer, String> selectCpu = new HashMap<Integer, String>();
        selectCpu.put(1, "M1");
        selectCpu.put(2, "M1 Pro");
        selectCpu.put(3, "Intel Core i5");
        selectCpu.put(4, "Intel Core i7");
        selectCpu.put(5, "Intel Celeron");

        Map<Integer, Integer> selectRam = new HashMap<Integer, Integer>();
        selectRam.put(1, 4);
        selectRam.put(2, 8);
        selectRam.put(3, 16);
        selectRam.put(4, 32);

        Map<Integer, Integer> selectSsd = new HashMap<Integer, Integer>();
        selectSsd.put(1, 128);
        selectSsd.put(2, 256);
        selectSsd.put(3, 512);
        selectSsd.put(4, 1024);

        Map<Integer, String> selectOS = new HashMap<Integer, String>();
        selectOS.put(1, "MacOs");
        selectOS.put(2, "Windows");
        selectOS.put(3, "Linux");

        Map<Integer, String> selectColor = new HashMap<Integer, String>();
        selectColor.put(1, "Black");
        selectColor.put(2, "White");
        selectColor.put(3, "Gray");
        selectColor.put(4, "Gold");
        selectColor.put(5, "Metallic");

        System.out.println("Введите цифру, соответствующую необходимому критерию отбора:\n ");
        for (Map.Entry<Integer, String> item : selectionMap.entrySet()) {
            System.out.printf("\t%d  -  %s \n", item.getKey(), item.getValue());
        }

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num > 6 || num < 1) {
            System.out.println("Неверное значение! Выберите цифру от 1 до 6.");
            num = in.nextInt();
        }
        String select = selectionMap.get(num);
        // System.out.println("Вы выбрали: " + select);
        
        
        switch (num) {
            case 1:
                System.out.println("Выберите необходимый критерий " + select);
                for (Map.Entry<Integer, Integer> item : selectSize.entrySet()) {
                    System.out.printf("\t%d  -  %d \n", item.getKey(), item.getValue());
                }
                int size = in.nextInt();
                int key1 = size;
                while (size > selectSize.size() || size < 1) {
                    System.out.println("Неверное значение! Выберите цифру от 1 до " + selectSize.size());
                    size = in.nextInt();
                }
                System.out.println("Выбранному критерию соответствуют следующие модели ноутбуков: \n");
                laptopStream.filter(p -> p.getScreenSizer() == selectSize.get(key1)).forEach(p -> System.out.println(p));
                break;
                
            case 2:
                System.out.println("Выберите необходимый критерий " + select);
                for (Map.Entry<Integer, String> item : selectCpu.entrySet()) {
                    System.out.printf("\t%d  -  %s \n", item.getKey(), item.getValue());
                }
                int cpu = in.nextInt();
                int key2 = cpu;
                while (cpu > selectCpu.size() || cpu < 1) {
                    System.out.println("Неверное значение! Выберите цифру от 1 до " + selectCpu.size());
                    cpu = in.nextInt();
                }
                System.out.println("Выбранному критерию соответствуют следующие модели ноутбуков: \n");
                laptopStream.filter(p -> p.getCpu() == selectCpu.get(key2)).forEach(p -> System.out.println(p));
                break;

            case 3:
                System.out.println("Выберите необходимый критерий " + select);
                for (Map.Entry<Integer, Integer> item : selectRam.entrySet()) {
                    System.out.printf("\t%d  -  %d \n", item.getKey(), item.getValue());
                }
                int ram = in.nextInt();
                int key3 = ram;
                while (ram > selectRam.size() || ram < 1) {
                    System.out.println("Неверное значение! Выберите цифру от 1 до " + selectRam.size());
                    ram = in.nextInt();
                }
                System.out.println("Выбранному критерию соответствуют следующие модели ноутбуков: \n");
                laptopStream.filter(p -> p.getRam() == selectRam.get(key3)).forEach(p -> System.out.println(p));
                break;

            case 4:
                System.out.println("Выберите необходимый критерий " + select);
                for (Map.Entry<Integer, Integer> item : selectSsd.entrySet()) {
                    System.out.printf("\t%d  -  %d \n", item.getKey(), item.getValue());
                }
                int ssd = in.nextInt();
                int key4 = ssd;
                while (ssd > selectSsd.size() || ssd < 1) {
                    System.out.println("Неверное значение! Выберите цифру от 1 до " + selectSsd.size());
                    ssd = in.nextInt();
                }
                System.out.println("Выбранному критерию соответствуют следующие модели ноутбуков: \n");
                laptopStream.filter(p -> p.getSsd() == selectSsd.get(key4)).forEach(p -> System.out.println(p));
                break;

            case 5:
                System.out.println("Выберите необходимый критерий " + select);
                for (Map.Entry<Integer, String> item : selectOS.entrySet()) {
                    System.out.printf("\t%d  -  %s \n", item.getKey(), item.getValue());
                }
                int os = in.nextInt();
                int key5 = os;
                while (os > selectOS.size() || os < 1) {
                    System.out.println("Неверное значение! Выберите цифру от 1 до " + selectOS.size());
                    os = in.nextInt();
                }
                System.out.println("Выбранному критерию соответствуют следующие модели ноутбуков: \n");
                laptopStream.filter(p -> p.getOs() == selectOS.get(key5)).forEach(p -> System.out.println(p));
                break;

            case 6:
                System.out.println("Выберите необходимый критерий " + select);
                for (Map.Entry<Integer, String> item : selectColor.entrySet()) {
                    System.out.printf("\t%d  -  %s \n", item.getKey(), item.getValue());
                }
                int colorS = in.nextInt();
                int key6 = colorS;
                while (colorS > selectColor.size() || colorS < 1) {
                    System.out.println("Неверное значение! Выберите цифру от 1 до " + selectColor.size());
                    colorS = in.nextInt();
                }
                System.out.println("Выбранным критериям соответствуют следующие модели ноутбуков: \n");
                laptopStream.filter(p -> p.getColor() == selectColor.get(key6)).forEach(p -> System.out.println(p));
                break;
        }

        in.close();

    }

}
