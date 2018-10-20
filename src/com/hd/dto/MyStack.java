package com.hd.dto;

/**
 * @author chuanhao.zhao@hand-china.com
 * @version 1.0
 * @name
 * @description
 * @date 2018/10/18
 */
public interface MyStack<T> {

    // 获取栈的大小
    int getSize();

    // 压栈
    void push(T element);

    // 出栈
    T pop();

    // 获取栈顶元素
    T peek();

    // 判断栈是否为空
    boolean isEmpty();

}
