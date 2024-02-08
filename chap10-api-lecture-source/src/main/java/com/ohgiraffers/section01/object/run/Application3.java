package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application3 {
    public static void main(String[] args) {
        /* hashCode() 메소드 오버라이딩
        *  Object 클래스의 명세에 작성된 일반 규약에 따르면
        *  equals() 메소드를 재정의 하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어있다.
        *  만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등 객체는
        *  같은 해시코드값을 가져야 한다는 규약에 위반되게 된다. (강제성은 없지만 규약대로 작성하길 권고)
        *
        *  그렇지 않으면, 해시 기반의 코드를 작성했을때 문제가 생길수 있다. */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        /* 오버라이딩 전엔 두 해시코드의 값이 다르다. boo1의 hashCode : 2055281021 / boo2의 hashCode : 1804094807
        *  오버라이딩 후 두 해시코드의 값이 같다. boo1의 hashCode : -1619022418 / boo2의 hashCode : -1619022418 */
        System.out.println("boo1의 hashCode : "+ book1.hashCode());
        System.out.println("boo2의 hashCode : "+ book2.hashCode());

    }
}
