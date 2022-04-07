package AdvancedConcepts.Generics;

public class MultipleParameter<K, V> {
    private K key;
    private V value;

    public MultipleParameter(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
