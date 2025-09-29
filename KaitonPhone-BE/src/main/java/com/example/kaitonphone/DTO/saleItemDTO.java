package com.example.kaitonphone.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class saleItemDTO {
    private Integer id;
    private String model;
    private String brandName;
    private String description;
    private Integer price;
    private Integer ramGb;
    private BigDecimal screenSizeInch;
    private Integer quantity;
    private Integer storageGb;
    private String color;
}
