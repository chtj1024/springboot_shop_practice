package com.shop.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainItemDto {

    private Long id;

    private String itemNm;

    private String itemDetail;

    private String imgUrl;

    private Integer price;

    @QueryProjection
    public MainItemDto(Long id, String imgUrl, String itemDetail, String itemNm, Integer price) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.itemDetail = itemDetail;
        this.itemNm = itemNm;
        this.price = price;
    }
}
