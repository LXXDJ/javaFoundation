package com.ohgiraffers.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int total = 0;

        String[][] setArr = new String[3][];
        setArr[0] = new String[]{"15", "파스타1", "피자1", "샐러드1"};
        setArr[1] = new String[]{"8","피자1", "음료1", "사이드1"};
        setArr[2] = new String[]{"20","파스타1", "피자1", "샐러드1", "사이드1", "음료2"};

        for(int i=0; i<setArr.length; i++){
            System.out.print("세트메뉴 구성 "+(i+1)+" : ");
            for(int a=1; a<setArr[i].length; a++){
                System.out.print(setArr[i][a]+" ");
            }
            System.out.print("("+setArr[i][0]+"% 할인)");
            System.out.println();
        }

        String[] pizzaArr = new String[]{"페퍼로니피자", "치즈피자", "포테이토피자", "불고기피자"};
        int[] pizzaPrice = new int[]{9900, 8900, 11900, 11900};
        String[] drinkArr = new String[]{"콜라", "사이다", "맥주", "자몽에이드"};
        int[] drinkPrice = new int[]{2000, 2000, 2800, 3900};
        String[] sideArr = new String[]{"치킨핑거", "프랜치프라이"};
        int[] sidePrice = new int[]{9900, 7900};
        String[] pastaArr = new String[]{"크림파스타", "토마토파스타", "오일파스타"};
        int[] pastaPrice = new int[]{12500, 15500, 14000};
        String[] saladArr = new String[]{"기본 샐러드", "치킨텐더 샐러드", "과일 샐러드", "버섯 샐러드"};
        int[] saladPrice = new int[]{3500, 12000, 8500, 10500};

        label: while(true){
            System.out.print("세트 메뉴 선택 : ");
            int setNum = sc.nextInt() - 1;

            if(setNum == 0){
                info(pastaArr, pastaPrice);
                System.out.print("선택 : ");
                int pastaNum = sc.nextInt() - 1;

                info(pizzaArr, pizzaPrice);
                System.out.print("선택 : ");
                int pizzaNum = sc.nextInt() - 1;

                info(saladArr, saladPrice);
                System.out.print("선택 : ");
                int saladNum = sc.nextInt() - 1;

                System.out.println("주문하신 메뉴 목록 : "+pastaArr[pastaNum]+", "+pizzaArr[pizzaNum]+", "+saladArr[saladNum]);

                sum = pastaPrice[pastaNum]+pizzaPrice[pizzaNum]+saladPrice[saladNum];
                total = (int)(sum*(100-15)*0.01);

            }else if(setNum == 1){
                info(pizzaArr, pizzaPrice);
                System.out.print("선택 : ");
                int pizzaNum = sc.nextInt() - 1;

                info(drinkArr, drinkPrice);
                System.out.print("선택 : ");
                int drinkNum = sc.nextInt() - 1;

                info(sideArr, sidePrice);
                System.out.print("선택 : ");
                int sideNum = sc.nextInt() - 1;

                System.out.println("주문하신 메뉴 목록 : "+pizzaArr[pizzaNum]+", "+drinkArr[drinkNum]+", "+sideArr[sideNum]);

                sum = pizzaPrice[pizzaNum]+drinkPrice[drinkNum]+sidePrice[sideNum];
                total = (int)(sum*(100-8)*0.01);

            }else if(setNum == 2){
                info(pastaArr, pastaPrice);
                System.out.print("선택 : ");
                int pastaNum = sc.nextInt() - 1;

                info(pizzaArr, pizzaPrice);
                System.out.print("선택 : ");
                int pizzaNum = sc.nextInt() - 1;

                info(saladArr, saladPrice);
                System.out.print("선택 : ");
                int saladNum = sc.nextInt() - 1;

                info(sideArr, sidePrice);
                System.out.print("선택 : ");
                int sideNum = sc.nextInt() - 1;

                info(drinkArr, drinkPrice);
                System.out.print("선택1 : ");
                int drinkNum1 = sc.nextInt() - 1;
                System.out.print("선택2 : ");
                int drinkNum2 = sc.nextInt() - 1;

                System.out.println("주문하신 메뉴 목록 : "+pastaArr[pastaNum]+", "+pizzaArr[pizzaNum]+", "+saladArr[saladNum]+", "+sideArr[sideNum]+", "+drinkArr[drinkNum1]+", "+drinkArr[drinkNum2]);

                sum = pastaPrice[pastaNum]+pizzaPrice[pizzaNum]+saladPrice[saladNum]+sidePrice[sideNum]+drinkPrice[drinkNum1]+drinkPrice[drinkNum2];
                total = (int)(sum*(100-20)*0.01);

            }else{
                System.out.println("잘못 입력하셨습니다. 1부터 3사이의 숫자를 입력해주세요.");
                continue label;
            }

            System.out.println("총 "+sum+"원의 세트 메뉴 구성 "+(setNum+1)+"을 "+setArr[setNum][0]+"% 할인으로 "+total+"원 입니다.");
            break;
        }

    }
    public static void info(String[] arr, int[] price){
        for(int i=0; i<arr.length; i++){
            System.out.print((i+1)+"."+arr[i]+" : "+price[i]+"원 ");
        }
        System.out.println();
    }
}
