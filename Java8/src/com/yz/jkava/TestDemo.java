package com.yz.jkava;


import java.util.Date;
import java.util.stream.Stream;

/**
 * Created by YZ on 2015/10/1.
 */
public class TestDemo {
    /*public static void main(String[] args) {
        Person person = Person.getInstance();
        System.out.println();*/
    public static void main(String[] args) {
        Person person1 = Person.getInstance();
        System.out.println(person1);
        Stream.of(1, 2, 3, 4, 5).filter(num -> num > 2).forEach(System.out::println);
         System.out.println(person1);

    }
}
