package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* [stack]
        *  Stack은 리스트 계열 클래스의 Vector 클래스를 상속 받아 구현하였다.
        *  스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        *  후입선출(LIFO - Last Input First Out) 방식의 자료구조 */

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);   // [1, 2, 3, 4, 5]

        // 위에서부터 아래로의 순서 (0번째 인덱스부터 바닥에 깔림)
        System.out.println(integerStack.search(5));     // 1

        /* Stack에서 값을 꺼내는 메소드
        *  peek() : 해당 스택의 가장 마지막(상단)에 있는 요소 반환
        *  pop() : 해당 스택의 가장 마지막(상단)에 있는 요소 반환 후 제거 */

        System.out.println("peek() : " + integerStack.peek());      // 5
        System.out.println(integerStack);                           // [1, 2, 3, 4, 5]
        System.out.println("pop() : " + integerStack.pop());        // 5
        System.out.println(integerStack);                           // [1, 2, 3, 4]


        System.out.println("pop() : " + integerStack.pop());        // 4
        System.out.println("pop() : " + integerStack.pop());        // 3
        System.out.println("pop() : " + integerStack.pop());        // 2
        System.out.println("pop() : " + integerStack.pop());        // 1
//        System.out.println("pop() : " + integerStack.pop());      // EmptyStackException : stack이 이미 비어있는 경우 에러 발생

    }
}
