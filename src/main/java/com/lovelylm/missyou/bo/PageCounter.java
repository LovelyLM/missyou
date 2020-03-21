package com.lovelylm.missyou.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by LovelyLM
 * 2020/3/20 21:23
 */
@Getter
@Setter
@Builder
public class PageCounter {

    private Integer page;
    private Integer count;
}
