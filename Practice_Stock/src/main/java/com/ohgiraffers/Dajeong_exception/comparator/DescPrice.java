package com.ohgiraffers.Dajeong_exception.comparator;

import com.ohgiraffers.Dajeong_exception.dto.stockDTO;

import java.util.Comparator;

public class DescPrice implements Comparator<stockDTO> {
    @Override
    public int compare(stockDTO o1, stockDTO o2) {
        return (o1.getPrice() > o2.getPrice())? -1 : 1;
    }
}
