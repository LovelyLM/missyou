package com.lovelylm.missyou.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by LovelyLM
 * 2020/3/20 21:31
 */
@Getter
@Setter
@NoArgsConstructor
public class Paging<T> {
    private Long total;
    private Integer count;
    private Integer page;
    private Integer totalPage;
    private List<T> items;

    public Paging(Page<T> pageT) {
        this.initPageParameters(pageT);
        this.items = pageT.getContent();

    }

    void initPageParameters(Page<T> pageT) {
        this.totalPage = pageT.getTotalPages();
        this.page = pageT.getNumber();
        this.count = pageT.getSize();
        this.total = pageT.getTotalElements();
    }

}
