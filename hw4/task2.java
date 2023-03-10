// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
package HWJava.hw4;

import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        enqueue(list, 6);
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(list);

    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        
    }

    public static Integer dequeue(LinkedList<Integer> list) {
        int num;
        num = list.removeFirst();
        return num;
        
    }

    public static int first(LinkedList<Integer> list) {
        int num;
        num = list.getFirst();
        return num;
    }
}
