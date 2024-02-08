package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {
    public static void main(String[] args) {
        /* equals() 메소드 오버라이딩
        *  equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true or false 값을 반환
        *  즉 동일한 인스턴스인지 비교하는 기능
        *
        *  동일객체 : 주소가 동일한 인스턴스
        *  동등객체 : 주소는 다르지만 필드값이 동일한 객체 */

        /* Object 클래스의 equals() vs String 클래스의 equals()
        *  Object 클래스의 equals() : 주소값을 비교
        *  String 클래스의 equals() : 내용(문자열) 비교 기능 (String 클래스에 이미 재정의 되어 있다.)
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        /* 오버라이딩 전 : 해시코드를 비교하기 때문에 둘다 false가 나온다.
        *  오버라이딩 후 : == 는 해시코드를 비교하여 false가 나오고, equals는 객체값을 비교하여 true가 나온다. */
        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));       // false
        System.out.println("두 인스턴스의 equals() 비교 : "+ (book1.equals(book2))); // true

    }
}
