package com.lovelylm.missyou.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

/**
 * Created by LovelyLM
 * 2020/3/18 22:47
 */

@Entity
@Getter
@Setter
public class BannerItem extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String img;
    private String keyword;
    private Short type;
    private Long bannerId;
    private String name;
}
