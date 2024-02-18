package com.ohgiraffers.Ayeon;

public class Application {
    public static void main(String[] args) {
        Program pro = new Program();

        pro.kindArr[0] = new String[]{"아몬드 26650","블루베리 12980","고추장 16620"};
        pro.kindArr[1] = new String[]{"사료 40000","장난감 20050","간식 26820","매트 70000"};

        pro.join();
    }
}
