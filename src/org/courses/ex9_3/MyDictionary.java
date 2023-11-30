package org.courses.ex9_3;

import java.util.ArrayList;

public class MyDictionary<K, V> {

    ArrayList<Element<K, V>> container = new ArrayList<>();

    public V getElement(K key) {
        for (Element<K, V> element : container) {
            if (key.equals(element.getKey())) {
                return element.getValue();
            }
        }
        return null;
    }

    public void addElement(K key, V value) {
        Element<K, V> element = new Element<>(key, value);
        container.add(element);
    }

    public int getSize() {
        return container.size();
    }
}


