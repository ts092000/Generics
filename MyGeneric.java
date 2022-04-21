package com.bkitsolution;

//1. Lớp Generic trong java
//Một lớp có thể tham chiếu bất kỳ kiểu đối tượng nào được gọi là lớp generic.
public class MyGeneric<T> {
    T obj;

    void  add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
}
