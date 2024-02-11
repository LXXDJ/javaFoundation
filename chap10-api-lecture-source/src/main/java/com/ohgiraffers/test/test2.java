package com.ohgiraffers.test;

import java.util.Scanner;

public class test2 {

    static Scanner sc = new Scanner(System.in);
    static int setNum;
    static int pastaNum;
    static int pizzaNum;
    static int saladNum;
    static int drinkNum;
    static int sideNum;
    static String order = "";
    static int sum = 0;
    static int total = 0;

    public static void main(String[] args) {

        String[] pizzaArr = new String[]{"페퍼로니피자", "치즈피자", "포테이토피자", "불고기피자"};
        int[] pizzaPrice = new int[]{9900, 8900, 11900, 11900};
        String[] drinkArr = new String[]{"콜라", "사이다", "맥주", "자몽에이드"};
        int[] drinkPrice = new int[]{2000, 2000, 2800, 3900};
        String[] sideArr = new String[]{"치킨핑거", "프랜치프라이"};
        int[] sidePrice = new int[]{9900, 7900};
        String[] pastaArr = new String[]{"크림파스타", "토마토파스타", "오일파스타"};
        int[] pastaPrice = new int[]{12500, 15500, 14000};
        String[] saladArr = new String[]{"기본샐러드", "치킨텐더샐러드", "과일샐러드", "버섯샐러드"};
        int[] saladPrice = new int[]{3500, 12000, 8500, 10500};

        Object[][] setArr = new Object[3][];
        setArr[0] = new Object[]{15, "파스타", "피자", "샐러드"};
        setArr[1] = new Object[]{8, "피자", "음료", "사이드"};
        setArr[2] = new Object[]{20, "파스타", "피자", "샐러드", "사이드", "음료", "음료"};

        for(int i=0; i<setArr.length; i++){
            System.out.print("세트메뉴 구성 "+(i+1)+" : ");
            for(int a=1; a<setArr[i].length; a++){
                System.out.print(setArr[i][a]+" 1 ");
            }
            System.out.print("("+setArr[i][0]+"% 할인)");
            System.out.println();
        }

        label: while(true){
            System.out.print("선택 : ");
            setNum = sc.nextInt() -1;

            if(0<= setNum && setNum<setArr.length){

                for(int i=1; i<setArr[setNum].length; i++){
                    String menu = (String)setArr[setNum][i];

                    switch (menu){
                        case "파스타":
                            info(pastaArr, pastaPrice);
                            calc(pastaArr, pastaPrice, pastaNum);
                            break;
                        case "피자" :
                            info(pizzaArr, pizzaPrice);
                            calc(pizzaArr, pizzaPrice, pizzaNum);
                            break;
                        case "샐러드" :
                            info(saladArr, saladPrice);
                            calc(saladArr, saladPrice, saladNum);
                            break;
                        case "사이드" :
                            info(sideArr, sidePrice);
                            calc(sideArr, sidePrice, sideNum);
                            break;
                        case "음료" :
                            info(drinkArr, drinkPrice);
                            calc(drinkArr, drinkPrice, drinkNum);
                            break;
                    }

                }

            }else{
                System.out.println("잘못 입력하셨습니다. 보기 중에서 골라주세요.");
                continue label;
            }

            System.out.print("주문하신 메뉴 목록 : "+order);
            System.out.println();

            int dc = (int) setArr[setNum][0];

            total = (int)(sum*(100-dc)*0.01);

            System.out.println("총 "+sum+"원의 세트메뉴 구성 "+(setNum+1)+"을 "+setArr[setNum][0]+"% 할인으로 "+total+"원 입니다.");

            break;
        }


    }
    public static void info(String[] arr, int[] price){
        for(int i=0; i<arr.length; i++){
            System.out.print((i+1)+"."+arr[i]+" : "+price[i]+"원 ");
        }
        System.out.println();
    }
    public static void calc(String[] arr, int[] price, int num){
        again: while(true){
            System.out.print("선택 : ");
            num = sc.nextInt()-1;

            if(0<=num && num<arr.length){
                order += arr[num]+" ";
                sum += price[num];
                break;
            }else{
                System.out.println("잘못 입력하셨습니다. 보기 중에서 골라주세요.");
                continue again;
            }

        }
    }

}
