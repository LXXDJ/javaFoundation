package com.hw1.model.dto;

public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(){}
    public Book(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public void setTitle(String title){this.title = title;}
    public void setAuthor(String author){this.author = author;}
    public void setPublisher(String publisher){this.publisher = publisher;}

    public String getTitle(){return this.title;}
    public String getAuthor(){return this.author;}
    public String getPublisher(){return this.publisher;}

    public String toString(){
        return title + ", 저자 : " + author + ", 출판사 : " + publisher;
    }
}
