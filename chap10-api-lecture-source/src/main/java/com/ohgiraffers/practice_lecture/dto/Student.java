package com.ohgiraffers.practice_lecture.dto;

public class Student extends Person {
    private int grade;
    private String major;

    public Student(){}
    public Student(String name, int age, double height, double weight, int grade, String major){
        super(age, height, weight);
        super.name = name;
        this.grade = grade;
        this.major = major;
    }

    public void setGrade(int grade){this.grade = grade;}
    public void setMajor(String major){this.major = major;}

    public int getGrade(){return this.grade;}
    public String getMajor(){return this.major;}

    @Override
    public String information(){
        return "이름 : "+this.name + super.information() + ", 학년 : "+this.grade + ", 전공 : "+this.major;
    }
}
