package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /* [FileOutputStream]
        *  프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림
        *  1바이트 단위로 데이터를 처리 */

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");
            fout.write(97);     // a

            /* 10 : 개행문자(줄바꿈) */
            byte[] bar = new byte[]{98,99,100,101,102,10};  // bcdef(개행)
            fout.write(bar);

            fout.write(bar, 1, 3);  // cde

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fout != null){
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
