package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {
    @Override
//    public void method2(int num){}        // 메소드 이름 변경 에러
//    public int method(int num){return 0;} // 메소드 리턴타입 변경 에러
//    public void method(String num){}      // 매개변수 타입 변경 에러
//    public void method(int num, String num){}      // 매개변수 개수 변경 에러
    public void method(int num){}

    @Override
//    private void privateMethod(){}        // private 메소드 오버라이딩 불가
//    public final void finalMethod(){}     // final 메소드 오버라이딩 불가
//    void protectedMethod(){}              // protected는 상속관계에 있다면 다른 패키지에서도 접근가능, default는 상속관계여도 접근불가
                                            // protected가 default보다 더 넓은 범위로 취급
//    protected void protectedMethod(){}      // 같은 범위 가능
    public void protectedMethod(){}         // 더 넓은 범위 가능

}
