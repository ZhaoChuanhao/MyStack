package com.hd.dto;

/**
 * @author chuanhao.zhao@hand-china.com
 * @version 1.0
 * @name MyLinkedListStack
 * @description 基于链表的栈
 * @date 2018/11/1
 */
public class MyLinkedListStack<T> implements MyStack<T> {

    private MyLinkedList<T> list;

    public MyLinkedListStack(){
        list = new MyLinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public void push(T element) {
        list.addFirst(element);
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }

    @Override
    public T peek() {
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
