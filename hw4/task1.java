// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
package HWJava.hw4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.print(reverse(list).toString());

    }
    
    public static LinkedList reverse(LinkedList<Integer> list) {
        int count = 0;
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int index = 0; index < list.size(); index++) {
            reverseList.addFirst(list.get(index));

        
       }
        return reverseList;

            
        // for (int index = 0; index < list.size(); index++) {
        //     list.addLast(list.get(index));
        //     list.removeFirst();
        // }
    }
}
