package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Application1 {
    public static void main(String[] args) {
        /* [stream]
        *  외부 데이터를 대상으로 작업할 때, 가장 먼저 해야할 일은
        *  자바 프로그램과 외부 데이터를 연결하는 것이다. (외부데이터란 프로그램 외부에 존재하는 모든 데이터를 의미)
        *  프로그램과 외부 데이터가 연결된 길을 스트림(stream)이라고 한다.
        *  스트림은 단방향이기 때문에 데이터를 읽어오기 위한 길은 입력스트림, 데이터를 출력하기 위한 길은 출력스트림 이라고 부른다.
        *
        *  자바 프로그램과 연결되는 외부 데이터의 타입이 무엇인지는 클래스의이름을 보고 유추 가능
        *  InputStream / OutputStream / Reader / Writer 를 빼고 남는 단어가 바로 외부 데이터 타입 */

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
