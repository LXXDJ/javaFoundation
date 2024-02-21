package com.ohgiraffers.Dajeong2.comparator;

import com.ohgiraffers.Dajeong2.dto.stockDTO;

import java.util.Comparator;

public class AscTitle implements Comparator<stockDTO> {
    @Override
    public int compare(stockDTO o1, stockDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
