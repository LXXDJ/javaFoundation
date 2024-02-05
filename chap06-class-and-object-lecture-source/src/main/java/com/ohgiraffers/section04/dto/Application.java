package com.ohgiraffers.section04.dto;

import com.ohgiraffers.section04.constructor.User;

public class Application {
    public static void main(String[] args) {
        /* [생성자를 이용한 초기화]
        *  장점 : setter 메소드를 여러번 호출해서 사용하지 않고 단 한번의 호출로 인스턴스를 생성 및 초기화 가능
        *  단점 : 필드를 초기화 할 매개변수의 갯수를 경우의 수 별로 모두 만들어둬야 함
        *        호출 시 인자가 많아지는 경우 어떠한 값이 어떤 필드를 의미하는지 한눈에 보기 힘듦
        *
        *  [설정자를 이용한 초기화]
        *  장점 : 필드를 초기화하는 각각의 값들이 어던 필드를 초기화하는지 명확하게 볼 수 있다.
        *  단점 : 하나의 인스턴스를 생성할 때 한번의 호출로 끝나지 않음
        *  */

        /* 생성자를 이용한 초기화 */
        UserDTO user1 = new UserDTO("ohgiraffers", "ohgiraffers", "ohgiraffers", new java.util.Date());
        System.out.println(user1.getInformation());

        /* 기본 생성자와 설정자를 이용한 초기화 */
        UserDTO user2 = new UserDTO();
        user2.setId("ohgiraffers");
        user2.setPwd("ohgiraffers");
        user2.setName("ohgiraffers");
        user2.setEnrollDate(new java.util.Date());

        System.out.println(user2.getInformation());

    }
}
