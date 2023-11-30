package org.courses.ex9_3;

public class Main {
    public static void main(String[] args) {
        MyDictionary <Integer, String > myDictionary = new MyDictionary<>();
        myDictionary.addElement(5, "value1");
        myDictionary.addElement(3, "value2");
        myDictionary.addElement(7, "value3");
        System.out.println(myDictionary.getElement(3));
        System.out.println(myDictionary.getSize());
    }
}
