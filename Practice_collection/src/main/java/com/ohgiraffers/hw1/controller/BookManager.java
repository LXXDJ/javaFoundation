package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BookManager {
    private ArrayList<BookDTO> bookList;
    private Scanner sc = new Scanner(System.in);

    public BookManager(){
        bookList = new ArrayList<>();
    }
    public void addBook(BookDTO book){
        bookList.add(book);
    }
    public void deleteBook(int isbn){
        boolean isTrue = true;

        for(int i=0; i<bookList.size(); i++){
            int num = bookList.get(i).getbNo();
            if(num == isbn){
                isTrue = false;
                bookList.remove(i);
                System.out.println(bookList.get(i).getTitle()+"(이)가 삭제되었습니다.");
            }
        }

        if(isTrue) System.out.println("조회된 도서가 목록에 없습니다.");
    }
    public void searchBook(String keyword){
        boolean isTrue = true;

        for(int i=0; i<bookList.size(); i++){
            String str = bookList.get(i).getTitle();
            if(str.contains(keyword)){
                isTrue = false;
                System.out.println(bookList.get(i));
            }
        }

        if(isTrue) System.out.println("조회된 도서가 목록에 없습니다.");
    }
    public void displayAll(){
        boolean isTrue = true;

        for(int i=0; i<bookList.size(); i++){
            isTrue = false;
            System.out.println(bookList.get(i));
        }

        if(isTrue) System.out.println("조회결과가 없습니다.");
    }
    public ArrayList<BookDTO> sortedBookList(int type){
//        1.도서번호 오름차순 / 2.도서번호 내림차순 / 3.책제목 오름차순 / 4.책제목 내림차순

        switch (type){
            case 1 :
                Comparator<BookDTO> ascBno = new AscBookNo();
                bookList.sort(ascBno);
                break;
            case 2 :
                Comparator<BookDTO> descBno = new DescBookNo();
                bookList.sort(descBno);
                break;
            case 3 :
                Comparator<BookDTO> ascBttl = new AscBookTitle();
                bookList.sort(ascBttl);
                break;
            case 4 :
                Comparator<BookDTO> descBttl = new DescBookTitle();
                bookList.sort(descBttl);
                break;
        }

        return bookList;
    }
    public void printBookList(ArrayList<BookDTO> printList){
        for(BookDTO i: printList){
            System.out.println(i);
        }
    }
}
