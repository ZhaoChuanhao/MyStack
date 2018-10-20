package com.hd.dto;

/**
 * @author chuanhao.zhao@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2018/10/18
 */
public interface MyStack<T> {

    int getSize();

    void push(T element);

    T pop();

    T peek();

    boolean isEmpty();

}
