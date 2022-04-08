package DataStructures.LinkedLists;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 lookup            O(n)
 by index          O(n)

 insert end        O(1)
 insert beginning  O(1)
 middle            O(n)

 deletion beginning O(1)
 middle             O(n)
 end                O(n)
 */
public class LinkedList {
    // Node class
    private class Node {
        private int value;
        private Node next;

        // Constructor
        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;  // head  pointers
    private Node last;   // tail  pointers
    private int size;

    private boolean isEmpty(){
        return first == null;
    }
    //addFirst
    public void addLast(int item){
        var node = new Node(item);
        // If the LinkedList is empty
        if (isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }
    //addLast
    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }
    //indexOf
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current != null){
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    //contains cleaver
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    //removeFirst
    public void removeFirst(){
        // [10 -> 20 -> 30]
        // first -> 20 [20 -> 30]
        if(isEmpty())
            throw new NoSuchElementException();
        //if one element
        if (first == last){
            first = last = null;
        }else{
            // Keep the reference of second.next first
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }
    //deleteLast
    public void removeLast(){
        // [10 -> 20 -> 30]
        // previous -> 20
        // last -> 30 but it must point to last ->20
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
        }else{
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
       size--;
    }
    private Node getPrevious(Node node) {
        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    //size O(1)
    public int size(){
        return size;
    }

    // Convert a linked-list to an array
    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    // Reverse a LinkedKList
    public void reverse() {
        // [10 -> 20 -> 30]
        //previous
        var previous = first;
        //current
        var current = first.next;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    // The kth node at the end of the linked-list in one pass
    public int getKthFromTheEnd(int k){
        if(isEmpty())
            throw new IllegalStateException();
        var a = first;
        var b = first;
        for (int i = 0; i < k -1; i++) {
            b = b.next;
            if(b == null)
                throw new IllegalArgumentException();
        }
        while(b != last) {
           a = a.next;
           b = b.next;
        }
     return a.value;
    }

    // Main function
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // addLast
        list.addLast(10);// return 0
        list.addLast(20);
        // addFirst
        list.addFirst(5);
        // indexOf
        System.out.println(list.indexOf(10)); // 1
        //contains
        System.out.println(list.contains(40)); //  false
        //removeFirst
        list.removeFirst();
        list.size();

        // getKth
        System.out.println(list.getKthFromTheEnd(10));
    }
}
