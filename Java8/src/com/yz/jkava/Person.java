package com.yz.jkava;

/**
 * Created by YZ on 2015/10/1.
 */
public class Person {
    private static Person ourInstance = new Person();

    public static Person getInstance() {
        return ourInstance;
    }

    private Person() {
        System.out.println();
    }
}
