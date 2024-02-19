package com.ohgiraffers.home.controller;

import com.ohgiraffers.home.comparator.AscBookNo;
import com.ohgiraffers.home.comparator.AscBookTitle;
import com.ohgiraffers.home.comparator.DescBookNo;
import com.ohgiraffers.home.comparator.DescBookTitle;
import com.ohgiraffers.home.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;

public class BookManager {
    private ArrayList<BookDTO> bookList;

    public BookManager(){
        bookList = new ArrayList<>();
    }
    public void addBook(BookDTO book){
        this.bookList.add(book);
    }
    public void deleteBook(int index){
        boolean isTrue = true;

        for(int i=0; i<bookList.size(); i++){
            int num = bookList.get(i).getbNo();
            if(num == index){
                isTrue = false;
                System.out.println(bookList.remove(i) + "(이)가 삭제되었습니다.");
            }
        }

        if(isTrue) System.out.println("일치하는 도서 번호가 없습니다.");
    }
    public void searchBook(String bTitle){
        boolean isTrue = true;

        for(int i=0; i<bookList.size(); i++){
            String str = bookList.get(i).getTitle();
            if(str.contains(bTitle)){
                isTrue = false;
                System.out.println(bookList.get(i));
            }
        }

        if(isTrue) System.out.println("일치하는 도서 제목이 없습니다.");
    }
    public void displayAll(){
        if(bookList.size() == 0){
            System.out.println("도서 목록이 비어있습니다.");
        }else{
            for(BookDTO i: bookList){
                System.out.println(i);
            }
        }
    }
    public ArrayList<BookDTO> sortedBookList(int type){
        switch (type){
            case 1 :
                Comparator<BookDTO> ascNo = new AscBookNo();
                bookList.sort(ascNo);
                break;
            case 2 :
                Comparator<BookDTO> descNo = new DescBookNo();
                bookList.sort(descNo);
                break;
            case 3 :
                Comparator<BookDTO> ascTtl = new AscBookTitle();
                bookList.sort(ascTtl);
                break;
            case 4 :
                Comparator<BookDTO> descTtl = new DescBookTitle();
                bookList.sort(descTtl);
                break;

        }

        return bookList;
    }
    public void printBookList(ArrayList<BookDTO> printList){
        for(BookDTO i: bookList){
            System.out.println(i);
        }
    }
}
