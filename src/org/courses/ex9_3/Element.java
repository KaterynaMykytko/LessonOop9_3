package org.courses.ex9_3;

public class Element < K, V >{

    private K key;
    private V value;

    public Element (K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
