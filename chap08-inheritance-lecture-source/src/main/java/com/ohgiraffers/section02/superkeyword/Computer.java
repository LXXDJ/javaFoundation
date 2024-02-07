package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

// extends 부모클래스(super 클래스) 를 입력하면 부모클래스를 상속받게 된다. 자식클래스(sub 클래스)
public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer(){
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Compurter 클래스 모든 필드를 초기화하는 생성자 호출");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate); // 부모생성자 호출
//        this(cpu, hdd, ram, operationSystem); // super 있기 때문에 여기선 this 사용 불가 (super와 this는 동시에 사용 불가)
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInfo(){
        /* 여기에서 this.getInfo() 또는 getInfo()를 쓰면 묵시적으로 this가 추가되기 때문에
        *  끊임없이 본인 스스로를 호출(재귀호출)하기 때문에 stackoverflow 에러가 발생한다. */
        return super.getInfo()+" Computer [cpu = "+this.cpu+", hdd = "+this.hdd+", ram = "+this.ram+", operationSystem = "+this.operationSystem+"]";
    }
}
