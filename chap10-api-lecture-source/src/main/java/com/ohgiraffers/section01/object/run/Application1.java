package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application1 {
    public static void main(String[] args) {
        /* 모든 클래스는 Object 클래스의 후손이다.
        *  따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
        *  또한 부모 클래스가 가지는 메소드를 오버라이딩 해서 사용한는 것도 가능하다. */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2, "목민심서", "정약용", 30000);

        /* 동일한 값을 가지는 인스턴스도 다른 해시코드값을 가진다. (풀클래스이름@16진수해시코드 반환)
        *  ex. book2와 book3은 같은 값을 입력해줬는데도 다른 해시코드 값을 가진다.*/
        System.out.println("book1.toString() : "+book1.toString()); // com.ohgiraffers.section01.object.book.Book@7a81197d
        System.out.println("book2.toString() : "+book2.toString()); // com.ohgiraffers.section01.object.book.Book@3f99bd52
        System.out.println("book3.toString() : "+book3.toString()); // com.ohgiraffers.section01.object.book.Book@4f023edb

        /* toString()을 호출하지 않고 레퍼런스 변수만 출력하는 경우 동일한 결과가 나온다. (이 경우 자동으로 toString() 메소드를 호출)
        *  이런 편리한 점을 이용해 totString() 메소드를 재정의해서 사용하게 된다. */
        System.out.println("book1 : " + book1); // book1 : BookVO [number = 1, title = 홍길동전, author = 허균, price = 50000]
        System.out.println("book2 : " + book2); // book2 : BookVO [number = 2, title = 목민심서, author = 정약용, price = 30000]
        System.out.println("book3 : " + book3); // book3 : BookVO [number = 2, title = 목민심서, author = 정약용, price = 30000]
    }
}
