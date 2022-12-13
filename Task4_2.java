/* Реализуйте очередь с помощью LinkedList со следующими методами:
   enqueue() - помещает элемент в конец очереди,
   dequeue() - возвращает первый элемент из очереди и удаляет его, 
   first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.LinkedList;

public class Task4_2 {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        enqueue(myList, "1");
        enqueue(myList, "2");
        enqueue(myList, "3");
        enqueue(myList, "4");
        enqueue(myList, "5");
        dequeue(myList);
        first(myList);
        dequeue(myList);
        dequeue(myList);
        first(myList);
        enqueueFirst(myList, "abc");
        enqueue(myList, "xyz");
        first(myList);
    }

    public static LinkedList<String> enqueue(LinkedList<String> items, String e) {
        items.addLast(e);
        System.out.println(items);
        return items;
    }

    public static LinkedList<String> enqueueFirst(LinkedList<String> items, String e) {
        items.addFirst(e);
        System.out.println(items);
        return items;
    }

    public static LinkedList<String> dequeue(LinkedList<String> items) {
        items.pollFirst();
        System.out.println(items);
        return items;
    }

    public static LinkedList<String> first(LinkedList<String> items) {
        System.out.println(items.peekFirst());
        return items;
    }
}
