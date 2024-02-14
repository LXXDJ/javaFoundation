package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* [Queue]
        *  Queue는 선형 메모리 공간에 데이터를 저장하는
        *  선입선출(FIFO - First Input First Out) 방식의 자료구조
        *  Queue 인터페이스를 상속받는 하위 인터페이스들은
        *  Deque, BlockingQueue, BlockingDeque, TransferQueue 등 다양하지만
        *  대부분의 Queue는 LinkedList를 이용한다. */

        /* Queue 자체로는 인터페이스라서 인스턴스 생성 불가능 */
//        Queue<String> que = new Queue<>();    // 에러 발생
        Queue<String> que = new LinkedList<>();

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);    // [first, second, third, fourth, fifth]

        /* peek() : 해당 Queue의 가장 앞에 있는(먼저 들어온) 요소 반환
        *  poll() : 해당 Queue의 가장 앞에 있는(먼저 들어온) 요소 반환 후 제거 */

        System.out.println("peek() : " + que.peek());   // first
        System.out.println("peek() : " + que.peek());   // first
        System.out.println(que);    // [first, second, third, fourth, fifth]

        System.out.println("poll() : " + que.poll());   // first
        System.out.println("poll() : " + que.poll());   // second
        System.out.println(que);    // [third, fourth, fifth]
    }
}
