import java.util.LinkedList;

/*  Пусть дан LinkedList с несколькими элементами. 
    Реализуйте метод, который вернет “перевернутый” список. */
    
    public class Task4_1 {

    public static void main(String[] args)
    {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("Cherry");
        myList.add("Strawberry");
        myList.add("Blueberry");
        myList.add("Raspberry");
        myList.add("Cranberry");
        myList.add("Blackberry");
        myList.add("Gooseberry");
        myList.add("Sea buckthorn");
        myList.add("Currant");
        System.out.print("My List before reversing: " + myList);
        myList = reverseLinkedList(myList);
        System.out.print("\nMy List after reversing: " + myList);
    }
 
    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
             revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}
