package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /* [Properties]
        *  HashMap을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조
        *  설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용 */

        Properties prop  = new Properties();

        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost/menudb");
        prop.setProperty("user", "ohgiraffers");
        prop.setProperty("password", "ohgiraffers");

        // 저장 순서 유지 안함, 키와 값을 묶어서 출력
        System.out.println(prop);   // {password=ohgiraffers, driver=com.mysql.cj.jdbc.Driver, user=ohgiraffers, url=jdbc:mysql://localhost/menudb}

        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileInputStream("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));

            prop2.list(System.out);

            System.out.println(prop.getProperty("driver"));
            System.out.println(prop.getProperty("url"));
            System.out.println(prop.getProperty("user"));
            System.out.println(prop.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(prop.getProperty("a"));
    }
}
