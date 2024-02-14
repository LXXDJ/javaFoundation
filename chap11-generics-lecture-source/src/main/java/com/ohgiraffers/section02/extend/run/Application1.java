package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        /* 토끼의 후손이거나 토끼인 경우에만 타입으로 사용 가능
        *  그 외의 타입으로 타입 지정시 컴파일 단계에서 에러 발생 */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

//        farm4.setAnimal(new Snake()); // 에러발생
        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        /* 제네릭을 사용해서 올바른 타입을 타입변수로 지정하는 경우
        *  인스턴스 내부에 있는 타입 자체가 Rabbit 타입을 갖고 있는 것이 보장되기 때문에 형변환 생략 가능*/
//        ((Bunny)farm6.getAnimal()).cry();
        farm6.getAnimal().cry();

    }
}
