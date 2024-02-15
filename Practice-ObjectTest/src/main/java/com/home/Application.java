package com.home;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 30);
        System.out.println(person.toString());

        person.setNationality("홍콩");
        System.out.println(person.toString());

        person.adopt();
        System.out.println(person.getMydog());

        String[] teachingAbility  = new String[]{"앉아", "빵", "기다려"};
        person.teach(teachingAbility);
        System.out.println(person.getMydog());
    }
}
