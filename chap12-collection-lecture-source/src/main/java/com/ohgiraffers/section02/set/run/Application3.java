package com.ohgiraffers.section02.set.run;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /* [TreeSet 클래스]
        *  TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소 저장
        *  이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠름
        *  JDK 1.2부터 제공
        *  Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다르다. */

        TreeSet<String> tset = new TreeSet<>();
        Set<String> tset2 = new TreeSet<>();   // 다형성 적용하여 Set 으로도 객체 생성 가능

        tset.add("java");
        tset.add("oracle");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        // TreeSet은 자동으로 오름차순 정렬
        System.out.println("tset : " + tset);   // [css, html, java, jdbc, oracle]


    }
}
