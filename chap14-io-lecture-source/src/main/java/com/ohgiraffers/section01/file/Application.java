package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /* [File 클래스]
         *  JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다.
         *  대상 파일에 대한 정보로 인스턴스를 생성하고 파일의 생성, 삭제 등의 처리를 수행하는 기능 제공*/

        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try {
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess : " + createSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());   // 현재 파일의 상위 경로까지만 출력
        System.out.println("파일의 절대경로 : " + file.getAbsolutePath());  // 최상위 위치부터의 경로

        boolean deleteSucess = file.delete();
        System.out.println("deleteSucess : " + deleteSucess);
    }
}
