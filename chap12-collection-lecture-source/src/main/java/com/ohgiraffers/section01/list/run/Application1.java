package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* [컬렉션 프레임워크(Collection Framework)]
        *  여러개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록 표준화된 방법을 제공하는 클래스들의 집합을 의미
        *  즉, 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스를 말한다.
        *
        *  Collection Framework는 크게 3가지 인터페이스 중 한가지를 상속받아 구현해 놓았다.
        *  1. List 인터페이스
        *  2. Set 인터페이스
        *  3. Map 인터페이스
        *
        *  List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
        *  하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다.
        *
        *  [List 인터페이스]
        *  - 순서가 있는 데이터 집합 (중복 저장 허용)
        *  - Vector, ArrayList, LinkedList, Stack, Queue 등
        *  [Set 인터페이스]
        *  - 순서가 없는 데이터 집합 (중복 저장 불허)
        *  - HashSet, TreeSet 등
        *  [Map 인터페이스]
        *  - 키와 값이 한쌍으로 이루어진 데이터 집합
        *  - key를 Set 방식으로 관리 (데이터 순서X, 중복 불허)
        *  - value는 중복 저장 허용
        *  - HashMap, TreeMap, HashTable, Properties 등 */

        /* [ArrayList]
        *  배열의 단점을 보완하기 위해 만들어짐
        *  배열은 크기 변경 불가, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점 보유
        *  ArrayList는 저러한 배열의 단점을 보완하고자 크기변경(새로운 더 큰 배열을 만들고 옮기기),
        *  요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
        *  자동적으로 수행, 속도가 빨라지는 것은 아님 */

        /* ArrayList는 인스턴스를 생성하게 되면 내부적으로 10칸짜리 배열을 생성하여 관리 */
        ArrayList alist = new ArrayList();

        List list = new ArrayList();        // 더 유연한 코드 작성 가능
        Collection clist = new ArrayList(); // 가장 상위 클래스인 Collection 도 가능

        alist.add("apple");
        alist.add(123);
        alist.add(45.67);
        alist.add(new Date());

        System.out.println("alist : " + alist); // [apple, 123, 45.67, Tue Feb 13 12:18:59 KST 20240]
        System.out.println("alist의 size : " + alist.size());    // 4

        // for문을 이용한 접근 가능
        for(int i=0; i<alist.size(); i++){
            System.out.println(i+" : "+alist.get(i));
        }
        alist.add("apple"); // 동일한 값 저장 가능
        System.out.println("alist : " + alist); // [apple, 123, 45.67, Tue Feb 13 12:36:05 KST 2024, apple]

        alist.add(1, "banana");    // 1번 인덱스에 banana 값 추가 (이후 인덱스는 뒤로 밀림)
        System.out.println("alist : " + alist); // [apple, banana, 123, 45.67, Tue Feb 13 12:37:54 KST 2024, apple]

        alist.remove(2);                  // 해당 인덱스에 있는 값 삭제 (이후 인덱스는 한칸씩 앞으로 당김)
        System.out.println("alist : " + alist); // [apple, banana, 45.67, Tue Feb 13 12:39:05 KST 2024, apple]

        alist.remove("apple");               // 일치하는 값 중 첫번째 값만 삭제
        System.out.println("alist : " + alist); // [banana, 45.67, Tue Feb 13 12:40:32 KST 2024, apple]

//        alist.set(1, true); // 오토박싱을 통해서 Boolean 값 true 값으로 수정됨 (Boolean.valueOf(true) 입력과 동일)
        alist.set(1, Boolean.valueOf(true)); // 해당 인덱스의 값 수정
        System.out.println("alist : " + alist); // [banana, true, Tue Feb 13 12:41:53 KST 2024, apple]

        System.out.println("isEmpty() : " + alist.isEmpty());   // false

        alist.clear();
        System.out.println("clear() : " + alist);               // [];

        System.out.println("isEmpty() : " + alist.isEmpty());   // true



        List<String> stringList = new ArrayList<>();    // 제네릭타입을 String으로 타입 지정
//        stringList.add(add);                          // String 타입이 아닌 값이 들어가면 에러 발생
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");
        System.out.println("stringList : " + stringList);   // [apple, banana, mango, grape]

        Collections.sort(stringList);                       // 오름차순 정렬
        System.out.println("stringList : " + stringList);   // [apple, banana, grape, mango]


        stringList = new LinkedList<>(stringList);

        /* [Iterator]
        *  Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        *  반복자라고 불리며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
        *  인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        *  인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
        *  hasNext() : 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false 반환
        *  next() : 다음 요소 반환 */

        // 형변환 필요. 내림차순 정렬
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();

        List<String> descList = new ArrayList<>();

        while(dIter.hasNext()){
            descList.add(dIter.next());
        }
        System.out.println("descList : " + descList);   // [mango, grape, banana, apple]


    }
}
