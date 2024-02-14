package com.ohgiraffers.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        // Stack 인스턴스 생성
        Stack<String> integerStack = new Stack<>();

        integerStack.push("가");
        integerStack.push("나");
        integerStack.push("다");
        integerStack.add("라");
        integerStack.add("마");

        System.out.println(integerStack);   // [가, 나, 다, 라, 마]

        System.out.println("size() : " + integerStack.size());              // 5

        System.out.println("search() : " + integerStack.search("가"));   // 5

        System.out.println("peek() : " + integerStack.peek());      // 마
        System.out.println(integerStack);                           // [가, 나, 다, 라, 마]
        System.out.println("pop() : " + integerStack.pop());        // 마
        System.out.println(integerStack);                           // [가, 나, 다, 라]

        integerStack.remove("가");
        System.out.println("remove() : " + integerStack);           // [나, 다, 라]


        System.out.println("pop() : " + integerStack.pop());        // 라
        System.out.println("pop() : " + integerStack.pop());        // 다

        System.out.println("isEmpty() : " + integerStack.isEmpty());    // false

        integerStack.clear();
        System.out.println("clear() : " + integerStack);                // []

        System.out.println("isEmpty() : " + integerStack.isEmpty());    // true

//        System.out.println("pop() : " + integerStack.pop());      // EmptyStackException : stack이 이미 비어있는 경우 에러 발생
    }
}
