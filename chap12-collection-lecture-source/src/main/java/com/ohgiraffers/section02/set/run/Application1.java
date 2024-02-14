package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /* [Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징]
        *  1. 요소의 저장 순서 유지 안함
        *  2. 같은 요소의 중복 저장 불허
        *
        *  [HashSet 클래스]
        *  Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나
        *  JDK 1.2부터 제공, 해시 알고리즘을 사용하여 검색 속도가 빠름 */

        HashSet<String> hset = new HashSet<>();
        // 아래의 경우 모두 가능하나, 지금은 HashSet으로 진행
//        Set hset2 = new HashSet();
//        Collection haset3 = new HashSet();

        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");
        System.out.println("hset : " + hset);   // [css, java, oracle, jdbc, html]

        hset.add("java");                       // 중복 저장 불허
        System.out.println("hset : " + hset);   // [css, java, oracle, jdbc, html] : 추가 안됨

        System.out.println("size() : " + hset.size());  // 5

        System.out.println("contains() : " + hset.contains("oracle"));  // true

        /* toArray() : HashSet에 저장된 모든 요소를 포함하는 새로운 'Object' 타입의 배열 반환 */
        Object[] arr = hset.toArray();
        for(int i=0; i<arr.length; i++){
            System.out.println(i + " : " + arr[i]);
        }

        /* iterator() : 목록을 만드는 역할. Collection 인터페이스의 메소드로,
        *               Collection에 저장된 요소들을 순차적으로 접근하는데 사용되는 Iterator를 반환한다. */
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("isEmpty() : " + hset.isEmpty());    // false

        hset.clear();
        System.out.println("clear() : " + hset);                // []

        System.out.println("isEmpty() : " + hset.isEmpty());    // true



    }
}
