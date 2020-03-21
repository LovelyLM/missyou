package com.lovelylm.missyou.util;
import com.lovelylm.missyou.bo.PageCounter;

/**
 * Created by LovelyLM
 * 2020/3/20 21:14
 */

public class CommUtil {
    public static PageCounter convertToPageParameter(Integer start, Integer count){
        int pageNum = start / count;

        PageCounter pageCounter = PageCounter.builder()
                .page(pageNum)
                .count(count)
                .build();

        return pageCounter;

    }
}
