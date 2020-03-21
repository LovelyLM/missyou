package com.lovelylm.missyou.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by LovelyLM
 * 2020/3/19 19:17
 */

public class Theme {
    @Id
    private Long id;
    private String title;
    private String name;

    @ManyToMany
    @JoinColumn(name = "them_spu")
    private List<Spu> spuList;
}
