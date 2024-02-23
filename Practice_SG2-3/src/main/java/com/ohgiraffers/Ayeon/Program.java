package com.ohgiraffers.Ayeon;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner sc = new Scanner(System.in);
    private String id;
    private String pw;
    private int balance;
    private String address = "등록된 배송지가 없습니다. 배송지를 등록해 주세요.";
    ArrayList<String> cartList = new ArrayList<>();
    private boolean isTrue = false;
    private String[][] kindArr = new String[2][];
    {
        kindArr[0] = new String[]{"아몬드 26650","블루베리 12980","고추장 16620"};
        kindArr[1] = new String[]{"사료 40000","장난감 20050","간식 26820","매트 70000"};
    }

    public void join(){
        label: while(true){
            System.out.println("안녕하세요! 신규 회원이신가요?\n회원가입 후 사용 가능합니다!\n회원가입을 하시려면 1번, 프로그램을 종료하시려면 2번을 입력하세요");
            int index = sc.nextInt();

            if(index != 1 && index != 2){
                System.out.println("보기 중에서 선택해주세요");
                continue label;
            }else if(index == 1){
                sc = new Scanner(System.in);
                System.out.print("아이디 입력 : ");
                id = sc.nextLine();
                System.out.print("비밀번호 입력 : ");
                pw = sc.nextLine();
                
                menu();
            }
            System.out.println("프로그램 종료");
            break label;
        }
    }

    public void menu(){
        label: while(true){
            System.out.println("=== 메뉴선택 ===\n0번 : 로그아웃\n1번 : 마이페이지\n2번 : 카테고리\n3번 : 상품 검색\n4번 : 장바구니");
            int index = sc.nextInt();

            switch (index){
                case 0 :
                    break label;
                case 1 : mypage();
                    continue label;
                case 2 : category();
                    continue label;
                case 3 : search();
                    continue label;
                case 4 : cart();
                    if(isTrue) continue label;
                    break label;
                default:
                    System.out.println("보기 중에서 선택해주세요");
                    continue label;
            }
        }
    }

    public void mypage(){
        label: while(true){
            System.out.println("고객님의 마이페이지 입니다.\n고객님의 아이디 : "+this.id+"\n고객님의 비밀번호 : "+this.pw+"\n고객님의 쇼핑머니 잔액 : "+this.balance+"\n배송지 : "+this.address+"\n보유 쿠폰 목록 : [가입 축하 쿠폰]");
            System.out.println("=== 메뉴선택 ===\n0번 : 메인 메뉴로 가기\n1번 : 배송지 등록\n2번 : 쇼핑머니 충전");
            int index = sc.nextInt();

            switch (index){
                case 0 :
                    break label;
                case 1 : address();
                    continue label;
                case 2 : charge();
                    continue label;
                default:
                    System.out.println("보기 중에서 선택해주세요");
                    continue label;
            }
        }
    }

    public void address(){
        sc = new Scanner(System.in);
        System.out.print("배송지 입력 : ");
        address = sc.nextLine();
        System.out.println("배송지가 정상적으로 등록되었습니다.");
    }

    public void charge(){
        label: while(true){
            sc = new Scanner(System.in);
            System.out.print("충전 금액 입력 : ");
            int num = sc.nextInt();

            if(num <= 0){
                System.out.println("충전 금액은 0 또는 0보다 작을 수 없습니다. 다시 입력해주세요.");
                continue label;
            }

            balance = num;
            System.out.println("현재 고객님의 보유 쇼핑머니는 "+this.balance+" 입니다.");
            break;
        }
    }

    public void category(){
        label: while(true){
            sc = new Scanner(System.in);
            System.out.println("카테고리를 선택해 주세요.\n0번 : 메인 메뉴로 가기\n1번 : 식품\n2번 : 반려동물 용품");
            int index = sc.nextInt();

            if(0< index && index <3){
                item(index-1);
            }else if(index == 0){

            }else{
                System.out.println("보기 중에서 선택해주세요");
                continue label;
            }

            break;
        }
    }

    public void item(int index){
        for(int i=0; i<kindArr[index].length; i++){
            System.out.println(i+"번 : "+kindArr[index][i] + "원");
        }

        sc = new Scanner(System.in);
        System.out.print("제품 선택 : ");
        int num = sc.nextInt();
        cartList.add(kindArr[index][num]);
        System.out.println(kindArr[index][num] + "원(이)가 장바구니에 담겼습니다.");
    }

    public void search(){
        sc = new Scanner(System.in);
        System.out.print("키워드 검색 : ");
        String keyword = sc.nextLine();
        Boolean isTrue = true;

        for(int i=0; i< kindArr.length; i++){
            for(int a=0; a<kindArr[i].length; a++){
                if(kindArr[i][a].contains(keyword)){
                    System.out.println(kindArr[i][a]);
                    isTrue = false;
                }
            }
        }

        if(isTrue) System.out.println("키워드에 일치하는 상품이 없습니다.");
    }

    public void cart(){
        int sum = 0;

        if(cartList.size() == 0){
            System.out.println("장바구니에 아무것도 담겨있지 않습니다. 메인메뉴로 돌아갑니다.");
            menu();
        }else{
            for(int i=0; i< cartList.size(); i++){
                String str = cartList.get(i);
                String[] strArr = str.split(" ");
                int price = Integer.parseInt(strArr[1]);
                sum += price;

                System.out.println(str);
            }
            System.out.println("총 가격은 " + sum + "원 입니다. ");

            label: while(true){
                sc = new Scanner(System.in);
                System.out.println("구매하시겠습니까? 1 : 예  2: 아니오");
                int num = sc.nextInt();

                if(num == 1){
                    System.out.println("구매를 완료하였습니다. 감사합니다.");
                    isTrue = false;
                }else if(num ==2){
                    System.out.println("구매를 취소하였습니다. 메인메뉴로 돌아갑니다.");
                    isTrue = true;
                }else{
                    System.out.println("보기 중에서 선택해주세요");
                    continue label;
                }
                break;
            }
        }
    }
}
