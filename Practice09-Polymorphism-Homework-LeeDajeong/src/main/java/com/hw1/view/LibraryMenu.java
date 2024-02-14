package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc;

    public void mainMenu(){
        sc = new Scanner(System.in);
        Member mem = new Member();

        System.out.print("회원 이름 입력 : ");
        mem.setName(sc.nextLine());
        System.out.print("회원 나이 입력 : ");
        mem.setAge(sc.nextInt());
        System.out.print("회원 성별 입력 : ");
        mem.setGender(sc.next().charAt(0));

        lm.insertMember(new Member(mem.getName(), mem.getAge(), mem.getGender()));

        label : while (true){
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지 \n2. 도서 전체 조회\n3. 도서 검색\n4. 도서 대여하기\n0. 프로그램 종료하기");
            System.out.print("번호 입력 : ");

            switch (sc.nextInt()){
                case 1:
                    System.out.println(lm.myinfo());;
                break;
                case 2: selectAll();
                break;
                case 3: searchBook();
                break;
                case 4: rentBook();
                break;
                case 0: break label;
                default:
                    System.out.println("보기 중에서 선택해주세요.");
                    break;
            }
        }
    }
    public void selectAll(){
        Book[] bList = lm.selectAll();

        for(int i=0; i<bList.length; i++){
            System.out.println((i+1)+"번 도서 : "+bList[i]);
        }
    }
    public void searchBook(){
        sc = new Scanner(System.in);

        System.out.print("키워드 입력 : ");
        Book[] searchList = lm.searchBook(sc.nextLine());

        for(Book i : searchList){
            if(i != null){
                System.out.println(i);
            }
        }
    }
    public void rentBook(){
        this.selectAll();
        int result = 0;

        sc = new Scanner(System.in);

        label: while (true){
            System.out.print("대여할 도서번호 입력 : ");
            int value = sc.nextInt();

            if(0 < value && value < lm.getbList().length){
                result = lm.rentBook( value-1);

                if(result == 0){
                    System.out.println("성공적으로 대여되었습니다.");
                }else if(result == 1){
                    System.out.println("나이 제한");
                }else if(result == 2){
                    System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n 마이페이지를 통해 확인하세요.");
                }
                break;

            }else{
                System.out.println("보기 중에서 입력해주세요.");
                continue label;
            }

        }


//        System.out.print("대여할 도서번호 입력 : ");
//        result = lm.rentBook(sc.nextInt() -1);

//        switch (result){
//            case 0 :
//                System.out.println("성공적으로 대여되었습니다.");
//                break;
//            case 1 :
//                System.out.println("“나이 제한으로 대여 불가능입니다.");
//                break;
//            case 2 :
//                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n 마이페이지를 통해 확인하세요.");
//                break;
//        }
    }

}
