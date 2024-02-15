package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        Member member = new Member();

        System.out.print("이름 입력 : ");
        member.setName(sc.nextLine());
        System.out.print("나이 입력 : ");
        member.setAge(sc.nextInt());
        System.out.print("성별 입력 : ");
        member.setGender(sc.next().charAt(0));

        sc.nextLine();

        lm.insertMember(new Member(member.getName(), member.getAge(), member.getGender()));

        label : for(;;){
            System.out.println("==== 메뉴 ====\n1. 마이페이지\n2. 도서 전체 조회\n3. 도서 검색\n4. 도서 대여하기\n0. 프로그램 종료하기");
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();

            switch (num){
                case 1 :
                    System.out.println(lm.myInfo());
                    break;
                case 2 : selectAll();
                    break;
                case 3 : searchBook();
                    break;
                case 4 : rentBook();
                    break;
                case 0 : break label;
            }
        }
    }
    public void selectAll(){
        Book[] bList = lm.selectAll();

        for(int i=0; i<bList.length; i++){
            System.out.println(i+"번 도서 : "+bList[i]);
        }
    }
    public void searchBook(){
        sc = new Scanner(System.in);
        System.out.print("검색할 제목 키워드 : ");
        String str = sc.nextLine();
        Book[] searchList = lm.serachBook(str);

        for(Book i : searchList){
            if(i != null) System.out.println(i);
        }
    }
    public void rentBook(){
        selectAll();

        System.out.print("대여할 도서번호 선택 : ");
        int num = sc.nextInt();
        int result = lm.rentBook(num);
        switch (result){
            case 0 :
                System.out.println("대여 성공");
                break;
            case 1 :
                System.out.println("나이 제한으로 대여 불가");
                break;
            case 2 :
                System.out.println("대여 성공. 요리학원 쿠폰 발급. 마이페이지에서 확인가능");
                break;
        }
    }
}
