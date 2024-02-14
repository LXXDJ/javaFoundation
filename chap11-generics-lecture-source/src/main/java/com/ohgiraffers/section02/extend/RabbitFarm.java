package com.ohgiraffers.section02.extend;

// 타입변수가 토끼거나 토끼의 후손만 가능
/* 인터페이스를 사용할때도 extends 사용
 * (O) public class RabbitFarm<T extends Animal>{}
 * (X) public class RabbitFarm<T emplements Animal>{} */
/* &로 타입 변수를 여러개 지정할 수 있다. (&로 묶어준 모든 타입에 해당해야함)
 * 단, 클래스는 하나만 지정 가능, &의 맨앞에는 클래스, 이후로는 인터페이스가 와야한다.
 * ex. public class RabbitFarm<T extends Rabbit & Animal>{} */
public class RabbitFarm<T extends Rabbit> {
    private T animal;

    public RabbitFarm() {}
    public RabbitFarm(T animal){this.animal = animal;}

    public void setAnimal(T animal){this.animal = animal;}
    public T getAnimal(){return this.animal;}
}
