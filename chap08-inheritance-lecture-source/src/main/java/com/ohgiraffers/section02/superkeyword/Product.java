package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    public Product(){
        System.out.println("Product 클래스의 기본생성자 호출");
    }

    // alt+inset 키를 누르고 constructor를 선택하고 초기화할 필드를 선택하면 자동으로 생성된다.
    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;

        System.out.println("Product 클래스의 매개변수 있는 생성자 호출");
    }

    // alt+inset 키를 누르고 Getter and Setter를 선택하고 초기화할 필드를 선택하면 자동으로 생성된다.
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInfo(){
        return "Product [code = "+this.code+", brand = "+this.brand+", name = "+this.name+", price = "+this.price+", manufacturingDate = "+this.manufacturingDate+"]";
    }
}
