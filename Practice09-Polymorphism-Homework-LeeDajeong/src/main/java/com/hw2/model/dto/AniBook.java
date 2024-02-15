package com.hw2.model.dto;

public class AniBook extends Book {
    private int accessAge;

    public AniBook(){};
    public AniBook(String title, String author, String publisher, int accessAge){
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public void setAccessAge(int accessAge){this.accessAge = accessAge;}
    public int getAccessAge(){return accessAge;}

    @Override
    public String toString(){
        return super.toString() + ", 연령제한 : " + accessAge;
    }
}
