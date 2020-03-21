package com.lovelylm.missyou.model;
import com.fasterxml.jackson.databind.node.POJONode;
import com.lovelylm.missyou.util.ListAndJson;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by LovelyLM
 * 2020/3/20 17:02
 */
@Entity
@Getter
@Setter
public class Sku extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private Boolean online;
    private String img;
    private String title;
    private Long spuId;
    private Long categoryId;
    private Long rootCategoryId;
    @Convert(converter = ListAndJson.class)
    private List<Object> specs;
    private String code;
    private Long stock;

}
