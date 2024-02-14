package com.ohgiraffers.practice;

import java.util.*;

public class test {
    public static void main(String[] args) {
        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset : " + lhset);     // [java, oracle, jdbc, html, css] : 저장순서 유지

        Iterator<String> iter = lhset.iterator();
        while(iter.hasNext()){                  // 다음요소가 있는지 확인하고 있다면,
            System.out.println(iter.next().toUpperCase());    // 다음요소 반환 (대문자로)
        }

        Object[] arr = lhset.toArray();
        for(Object obj : arr){
//            System.out.println(obj.toUpperCase());    // Object 타입에서 String 타입을 사용할 수 없다.
            System.out.println(((String)obj).toUpperCase());    // 강제형변환
        }
    }
}
