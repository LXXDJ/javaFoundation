package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];

    CookBook cbook = new CookBook();
    AniBook abook = new AniBook();
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public Book[] getbList(){return bList;}

    public void insertMember(Member mem){
        this.mem = mem;
    }
    public Member myinfo(){
        return mem;
    }
    public Book[] selectAll(){
        return bList;
    }
    public Book[] searchBook(String keyword){
        Book[] bookResult = new Book[5];

        for (int i=0; i<bList.length; i++){
            String text = bList[i].getTitle().concat(bList[i].getAuthor()).concat(bList[i].getPublisher());

            if(text.contains(keyword)){
                bookResult[i] = bList[i];
            }
        }
        System.out.println(keyword + "에 해당하는 도서가 없습니다.");

        return bookResult;
    }
    public int rentBook(int index){
        int result = 0;

        if(bList[index] instanceof AniBook){
            if(mem.getAge() < abook.getAccessAge()){
                result = 1;
            }
        }else if(bList[index] instanceof CookBook){
            if(((CookBook) bList[index]).getCoupon()){
                System.out.println("실행");
                mem.setCouponCount(mem.getCouponCount() +1);
                result = 2;
            }
        }

        return result;
    }

}
