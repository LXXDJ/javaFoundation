package com.hw2.controller;

import com.hw2.model.dto.AniBook;
import com.hw2.model.dto.Book;
import com.hw2.model.dto.CookBook;
import com.hw2.model.dto.Member;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];
    CookBook cookBook = new CookBook();
    AniBook aniBook = new AniBook();

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
    public Member myInfo(){
        return mem;
    }
    public Book[] selectAll(){
        return bList;
    }
    public Book[] searchBook(String keyword){
        Book[] newList = new Book[5];

        for (int i=0; i<newList.length; i++){
            String txt = bList[i].getTitle().concat(bList[i].getAuthor()).concat(bList[i].getPublisher());

            if(txt.contains(keyword)) newList[i] = bList[i];
        }

        return newList;
    }
    public int rentBook(int index){
        int result = 0;

        if(bList[index] instanceof AniBook){
            if(((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
                result = 1;
            }
        }else if(bList[index] instanceof CookBook){
            if(((CookBook) bList[index]).getCoupon()){
                mem.setCouponCount(mem.getCouponCount()+1);
                result = 2;
            }
        }

        return result;
    }

}
