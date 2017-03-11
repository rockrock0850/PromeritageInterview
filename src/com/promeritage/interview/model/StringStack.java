package com.promeritage.interview.model;

import java.util.LinkedList;

public class StringStack {
	 
    // 以下方法在 List interface 沒有提供
    // 因此必須將型態宣告為 LinkedList
    private LinkedList<String> linkedList;
 
    public StringStack() {
        linkedList = new LinkedList<String>();
    }
 
    public void push(String name) {
        linkedList.addFirst(name);
    }
 
    public String top() {
        return linkedList.getFirst();
    }
 
    public String pop() {
        return linkedList.removeFirst();
    }
 
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}