package AdvancedConcepts.Generics;

// The T here can extends Comparable and Cloneable
// The wildcard represents an unknown type
public class Generics<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }
    public T get(int index){
        return items[index];
    }
}
