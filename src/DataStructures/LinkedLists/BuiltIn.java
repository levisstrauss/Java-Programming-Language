package DataStructures.LinkedLists;

import java.util.LinkedList;

public class BuiltIn {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(100);
        list.removeFirst();
        list.removeLast();
        list.contains(10);
        list.indexOf(10);
        list.size();
        list.toArray();
        System.out.println(list);
    }
}
