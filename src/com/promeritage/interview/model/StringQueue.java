package com.promeritage.interview.model;

import java.util.LinkedList;

public class StringQueue {
	 
    // 以下方法在 List interface 沒有提供
    // 因此必須將型態宣告為 LinkedList
    private LinkedList<String> linkedList;
 
    public StringQueue() {
        linkedList = new LinkedList<String>();
    }
 
    public void put(String name) {
        linkedList.addFirst(name);
    }
 
    public String get() {
        return linkedList.removeLast();
    }
 
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}	