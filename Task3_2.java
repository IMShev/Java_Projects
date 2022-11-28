    /* Пусть дан произвольный список целых чисел, удалить из него четные числа */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3_2 {
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
        System.out.print("Original array: ");
        printArray(list);
     
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }    
        }
        System.out.print("Array with deleted even numbers: ");
        printArray(list);
    }
}
