package com.hw2.view;

import com.hw2.controller.LibraryManager;
import com.hw2.model.dto.Book;
import com.hw2.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);
    Member member = new Member();

    public void mainMenu(){
        System.out.print("이름 입력 : ");
        member.setName(sc.nextLine());
        System.out.print("나이 입력 : ");
        member.setAge(sc.nextInt());
        System.out.print("성별 입력 : ");
        member.setGender(sc.next().charAt(0));

        lm.insertMember(new Member(member.getName(), member.getAge(), member.getGender()));

        label: while (true){
            System.out.println("==== 메뉴 ====\n1. 마이페이지\n2. 도서 전체 조회\n3. 도서 검색\n4. 도서 대여하기\n0. 프로그램 종료하기");
            System.out.print("번호 입력 : ");

            switch (sc.nextInt()){
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
                default:
                    System.out.println("목록 중에서 선택해주세요");
                    continue label;
            }
        }
    }
    public void selectAll(){
        Book[] bList = lm.selectAll();

        for(int i=0; i<bList.length; i++){
            System.out.println(i+"번째 도서 : "+bList[i]);
        }
    }
    public void searchBook(){
        sc = new Scanner(System.in);
        System.out.print("검색할 제목 키워드 : ");
        Book[] searchList = lm.searchBook(sc.nextLine());

        for(Book i : searchList){
            if(i != null) System.out.println(i);
        }
    }
    public void rentBook(){
        selectAll();

        label : while (true){
            System.out.print("대여할 도서 번호 선택 : ");
            int selectNum = sc.nextInt();

            if(selectNum >= 0 && selectNum < lm.getbList().length){
                int num = lm.rentBook(selectNum);

                if(num == 0){
                    System.out.println("성공적으로 대여되었습니다.");
                }else if(num == 1){
                    System.out.println("나이 제한으로 대여 불가능입니다.");
                }else if(num == 2){
                    System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n마이페이지를 통해 확인하세요.");
                }

                break;
            }else{
                System.out.println("목록 중에서 선택해주세요");
                continue label;
            }
        }
    }

//    public void rentBook(){
//        selectAll();
//
//        System.out.print("대여할 도서 번호 선택 : ");
//        int num = lm.rentBook(sc.nextInt());
//
//        if(num == 0){
//            System.out.println("성공적으로 대여되었습니다.");
//        }else if(num == 1){
//            System.out.println("나이 제한으로 대여 불가능입니다.");
//        }else if(num == 2){
//            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n마이페이지를 통해 확인하세요.");
//        }
//    }
}
