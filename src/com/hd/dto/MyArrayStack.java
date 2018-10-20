package com.hd.dto;

/**
 * @author chuanhao.zhao@hand-china.com
 * @version 1.0
 * @name MyArrayStack
 * @description 基于动态数组的栈
 * @date 2018/10/18
 */
public class MyArrayStack<T> implements MyStack<T> {

    MyArray<T> array;

    public MyArrayStack(int capacity){
        array = new MyArray<>(capacity);
    }

    public MyArrayStack(){
        array = new MyArray<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public void push(T element) {
        array.add(element);
    }

    @Override
    public T pop() {
        return array.remove();
    }

    @Override
    public T peek() {
        return array.get();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public String toString() {
        return array.toString();
    }

}
