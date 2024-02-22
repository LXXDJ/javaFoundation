package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu(){}
    public void mainMenu(){
        label: while (true){
            System.out.println("=== 도서 관리 프로그램 ===\n1. 새 도서 추가\n2. 도서정보 정렬 후 출력\n3. 도서 삭제\n4. 도서 검색출력\n5. 전체 출력\n6. 끝내기");
            System.out.print("메뉴 선택 : ");
            int index = sc.nextInt();
            sc.nextLine();

            switch (index){
                case 1 : bm.addBook(inputBook());
                    continue label;
                case 2 : bm.printBookList(selectSortedBook());
                    continue label;
                case 3 : bm.deleteBook(inputBookNo());
                    continue label;
                case 4 : bm.searchBook(inputBookTitle());
                    continue label;
                case 5 : bm.displayAll();
                    continue label;
                case 6 :
                    System.out.println("프로그램 종료");
                    break;
                default: continue label;
            }
            break;
        }
    }
    public BookDTO inputBook(){
        System.out.print("도서 번호 : ");
        int addBno = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 제목 : ");
        String addBtitle = sc.nextLine();
        System.out.print("도서 장르(1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int addBcategory = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자 : ");
        String addBauthor = sc.nextLine();

        BookDTO book = new BookDTO(addBno, addBcategory, addBtitle, addBauthor);

        return book;
    }
    public int inputBookNo(){
        System.out.print("도서 번호 : ");
        int inputNumber = sc.nextInt();
        sc.nextLine();

        return inputNumber;
    }
    public String inputBookTitle(){
        System.out.print("도서 제목 : ");
        String inputTitle = sc.nextLine();

        return inputTitle;
    }
    public ArrayList<BookDTO> selectSortedBook(){
        System.out.print("도서 정렬방식(1.도서번호 오름차순 / 2.도서번호 내림차순 / 3.책제목 오름차순 / 4.책제목 내림차순) : ");
        int sortedType = sc.nextInt();

        return bm.sortedBookList(sortedType);
    }
}
