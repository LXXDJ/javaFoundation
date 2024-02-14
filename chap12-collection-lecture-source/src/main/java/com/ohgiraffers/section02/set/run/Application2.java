package com.ohgiraffers.section02.set.run;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        /* [LinkedHashSet 클래스]
        *  HashSet이 가지는 기능을 모두 갖고 있고 추가적으로 저장 순서를 유지하는 특징이 있다.
        *  JDK 1.4 부터 제공 */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset : " + lhset);     // [java, oracle, jdbc, html, css] : 저장순서 유지

        TreeSet<String> tset = new TreeSet<>(lhset);    // 뒤에서 배울 예정
        System.out.println("tset : " + tset);       // [css, html, java, jdbc, oracle] : 오름차순 정렬

        Iterator<String> iter = tset.iterator();
        while(iter.hasNext()){                  // 다음요소가 있는지 확인하고 있다면,
            System.out.println(iter.next().toUpperCase());    // 다음요소 반환 (대문자로)
        }

        Object[] arr = tset.toArray();
        for(Object obj : arr){
//            System.out.println(obj.toUpperCase());    // Object 타입에서 String 타입을 사용할 수 없다.
            System.out.println(((String)obj).toUpperCase());    // 강제형변환
        }

        /* 로또 번호 발생 (TreeSet 특징 이용) */
        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6){
            lotto.add((int)(Math.random()*45)+1);
        }
        System.out.println("lotto : " + lotto);     // TreeSet : 중복X, 오름차순 자동정렬


    }
}
