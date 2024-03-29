package com.hw1.model.dto;

public class AniBook extends Book {
    public int accessAge;

    public AniBook(){}
    public AniBook(String title, String author, String publisher, int accessAge){
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public void setAccessAge(int accessAge){this.accessAge = accessAge;}
    public int getAccessAge(){return this.accessAge;}

    @Override
    public String toString(){
        return super.toString() + ", 제한연령 : " + accessAge;
    }
}
