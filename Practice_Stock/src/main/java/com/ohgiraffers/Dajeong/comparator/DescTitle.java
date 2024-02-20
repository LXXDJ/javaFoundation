package com.ohgiraffers.Dajeong.comparator;

import com.ohgiraffers.Dajeong.model.dto.stockDTO;
import java.util.Comparator;

public class DescTitle implements Comparator<stockDTO> {
    @Override
    public int compare(stockDTO o1, stockDTO o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
