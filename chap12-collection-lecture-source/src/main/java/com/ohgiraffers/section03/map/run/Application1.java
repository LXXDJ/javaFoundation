package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* [Map 인터페이스]
        *  Collection 인터페이스와는 다른 저장 방식을 가진다.
        *  키(key)와 값(value)을 하나의 쌍으로 저장하는 방식 사용
        *
        *  키(key)
        *  값(value)을 찾기 위한 이름 역할을 하는 객체를 의미
        *  1. 요소의 저장 순서 유지 안함
        *  2. 키는 중복 불허, 값은 허용(키가 달라야 함)
        *
        *  대표적인 클래스 : HashMap, HashTable, TreeMap 등
        *  HashMap이 가장 많이 사용됨 */

        HashMap hmap = new HashMap();

        /* 키와 값을 쌍으로 저장, autoBoxing 처리 됨 : 12 -> new Integer(12) */
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("hmap : " + hmap);   // {33=123, one=Wed Feb 14 11:17:42 KST 2024, 12=red apple}

        /* 키는 중복 저장 불허 */
        hmap.put(12, "yellow banana");          // 키를 중복하여 저장하면 해당 키의 값이 제일 마지막에 입력된 것으로 오버라이드 됨
        System.out.println("hmap : " + hmap);   // {33=123, one=Wed Feb 14 11:19:11 KST 2024, 12=yellow banana}

        /* 값은 중복 저장 허용 */
        hmap.put(11, "yellow banana");
        hmap.put(9, "yellow banana");
        System.out.println("hmap : " + hmap);   // {33=123, one=Wed Feb 14 11:33:32 KST 2024, 9=yellow banana, 11=yellow banana, 12=yellow banana}

        // get() : key에 해당하는 value를 가져옴
        System.out.println("키 9에 대한 객체 : " + hmap.get(9));  // yellow banana

        hmap.remove(9);
        System.out.println("remove() : " + hmap);   // {33=123, one=Wed Feb 14 11:35:52 KST 2024, 11=yellow banana, 12=yellow banana}

        System.out.println("size() : " + hmap.size());  // 4

        /* 제네릭스 이용 */
        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java 8");
        hmap2.put("two", "mysql");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");

        Iterator<String> keyIter = hmap2.keySet().iterator();
        while(keyIter.hasNext()){
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " = " + value);    // 키와 값이 쌍으로 출력 (순서 무관)
        }

//        Collection<String> values = hmap2.values();
//        Iterator<String> valueIter2 = values.iterator();
        Iterator<String> valueIter = hmap2.values().iterator(); // 위의 두줄을 한줄로 작성
        while (valueIter.hasNext()){
            System.out.println(valueIter.next());       // value 만 출력
        }

        // 배열로 만들어서 처리
        Collection<String> values = hmap2.values();
        Object[] valueArr = values.toArray();
        for(int i=0; i<valueArr.length; i++){
            System.out.println(i+ " : " + valueArr[i]); // 배열의 인덱스 값 : value 값 출력
        }


        /* [Entry] : 키 객체와 값 객체를 쌍으로 묶은 것
        *  Entry는 java.util.Map 인터페이스의 내부 인터페이스로, Map 안의 키-값 쌍을 나타낸다.
        *
        *  [entrySet()] : Map에 저장된 모든 키-값 쌍(Entry)을 Set 형태로 반환
        *  getKey()와 getValue() 메소드를 제공하여 키와 값을 각각 가져올 수 있다.
        *
        *  Map.Entry 객체는 하나의 키와 값에 대한 참조제공, 이를 통해 특정 Map 항목의 키 or 값을 가져오거나 설정 가능 */

//        Set<Map.Entry<String, String>> set = hmap2.entrySet();
//        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        // 위의 두줄을 한줄로 작성
        Iterator<Map.Entry<String, String>> entryIter = hmap2.entrySet().iterator();

        while (entryIter.hasNext()){
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
