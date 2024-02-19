package com.ohgiraffers.home.comparator;

import com.ohgiraffers.home.model.dto.BookDTO;

import java.util.Comparator;

public class AscBookNo implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return (o1.getbNo() > o2.getbNo())? 1 : -1;
    }
}
