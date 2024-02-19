package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class AscBookNo implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int num = 0;
        if(o1.getbNo() > o2.getbNo()){
            num = 1;
        }else if(o2.getbNo() > o1.getbNo()){
            num = -1;
        }
        return num;
    }
}
