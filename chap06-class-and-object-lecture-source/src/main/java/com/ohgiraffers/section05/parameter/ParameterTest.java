package com.ohgiraffers.section05.parameter;

public class ParameterTest {
    public void primaryTypeParameter(int num){
        System.out.println("매개변수로 전달 받은 값 : " + num);
    }
    public void primaryTypeArrayParameter(int[] iarr){
        /* 배열의 주소가 전달된다.
        *  즉 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가르킨다. (얕은 복사) */
        System.out.println();
        System.out.print("매개변수로 전달 받은 값 : " + iarr);
        System.out.println();
        System.out.print("배열의 값 출력 : ");
        for(int i=0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;

        System.out.print("변경 후 배열의 값 출력 : ");
        // 향상된 for문
        for(int i : iarr){
            System.out.print(i + " ");
        }
    }
    public void classTypeParameter(RectAngle rectAngle){
        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        System.out.println("==== 변경 전 사각형의 넓이와 둘레 ====");
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setWidth(100);
        rectAngle.setHeight(100);

        System.out.println("==== 변경 후 사각형의 넓이와 둘레 ====");
        rectAngle.calcArea();
        rectAngle.calcRound();
    }

    public void variableLengthArrayparameter(String name, String...hobby){
        System.out.println("이름 : " + name);
        System.out.println("취미 개수 : " + hobby.length);
        System.out.print("취미 : ");
        for(String i : hobby){
            System.out.print(i + " ");
        }
    }

    /* 오버로딩 시 주의
    * 둘 중 어떤 메소드를 호출하는 것인지에 대한 모호성이 발생했기 때문에 에러 발생
    *  가변배열을 매개변수로 이용한 메소드는 모호성으로 인해 오버로딩 하지 않는것이 좋다.*/
//    public void variableLengthArrayparameter(String...hobby){
//        System.out.println("취미 개수 : "+hobby.length);
//        System.out.print("취미 : ");
//        for(String i : hobby){
//            System.out.print(i + " ");
//        }
//    }
}
