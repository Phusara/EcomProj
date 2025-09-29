package com.example.kaitonphone.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "saleitem")
public class Saleitem {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "model", nullable = false, length = 60)
    private String model;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "brandId", nullable = false)
    private Brand brand;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "ramGb")
    private Integer ramGb;

    @Column(name = "screenSizeInch", precision = 5, scale = 2)
    private BigDecimal screenSizeInch;

    @Column(name = "storageGb")
    private Integer storageGb;

    @Column(name = "color", length = 50)
    private String color;

    @ColumnDefault("1")
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

}