package com.ohgiraffers.Dajeong_asc.comparator;

import com.ohgiraffers.Dajeong_asc.dto.stockDTO;

import java.util.Comparator;

public class AscTitle implements Comparator<stockDTO> {
    @Override
    public int compare(stockDTO o1, stockDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
