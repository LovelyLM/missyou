package com.lovelylm.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by LovelyLM
 * 2020/3/20 17:13
 */
@Entity
@Getter
@Setter
public class SpuDetailImg extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String img;

    private Long spuId;

    private Long index;
}
