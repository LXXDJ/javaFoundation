package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        Application3 app3 = new Application3();

        Animal animal1 = new Cat();
        Animal animal2 = new Tiger();

        app3.feed(animal1);     // 동일한 타입이기 때문에 가능
        app3.feed(animal2);

        Cat animal3 = new Cat();
        Tiger animal4 = new Tiger();

        app3.feed(animal3);     // app3.feed((Animal)animal3); Cat 타입에서 Animal 타입으로
        app3.feed(animal4);     // app3.feed((Animal)animal4); 업캐스팅 : 자동형변환(묵시적 형변환)

        app3.feed(new Cat());   // 이렇게 바로 호출할 수도 있다.
        app3.feed(new Tiger());

    }
    public void feed(Animal animal){
        animal.eat();
    }

//    public void feed(Cat cat){}       // 다형성이 없었다면 이렇게 일일이 적어줬어야 했음
//    public void feed(Tiger tiger){}
}
