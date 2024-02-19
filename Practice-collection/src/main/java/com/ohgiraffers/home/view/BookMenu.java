package com.ohgiraffers.home.view;

import com.ohgiraffers.home.controller.BookManager;
import com.ohgiraffers.home.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu(){}
    public void mainMenu(){
        label : while(true){
            System.out.println("1.도서 추가\n2.도서 정렬\n3.도서 삭제\n4.도서 검색\n5.전체 출력\n6.끝내기");
            System.out.print("메뉴 번호 선택 : ");
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
                default:
                    System.out.println("보기 중에서 선택해주세요.");
                    continue label;
            }
            break;
        }
    }
    public BookDTO inputBook(){
        System.out.print("도서 번호 : ");
        int inputBno = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 분류(1.인문/2.자연과학/3.의료/4.기타) : ");
        int inputCate = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 제목 : ");
        String inputTtl = sc.nextLine();
        System.out.print("도서 저자 : ");
        String inputAuthor = sc.nextLine();

        BookDTO dto = new BookDTO(inputBno, inputCate, inputTtl, inputAuthor);

        return dto;
    }
    public int inputBookNo(){
        System.out.print("도서 번호 : ");
        int inputBno = sc.nextInt();
        sc.nextLine();

        return inputBno;
    }
    public String inputBookTitle(){
        System.out.print("도서 제목 : ");
        String inputTtl = sc.nextLine();

        return inputTtl;
    }
    public ArrayList<BookDTO> selectSortedBook(){
        System.out.print("정렬 방식(1.번호 오름차순 / 2.번호 내림차순 / 3.제목 오름차순 / 4.제목 내림차순) : ");
        int type = sc.nextInt();
        sc.nextLine();

        return bm.sortedBookList(type);
    }
}
